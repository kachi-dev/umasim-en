#!/usr/bin/env python3
"""
Course Data Update Script
Replaces corners/straights/slopes in rawData.kt with data from global_course_data.json
"""

import json
import re
from typing import Dict, Any

def parse_rawdata_kt(file_path: str) -> Dict[str, Any]:
    """Parse the rawData.kt file and extract course data."""
    with open(file_path, 'r', encoding='utf-8') as f:
        content = f.read()
    
    # Extract the JSON part from the rawData.kt file
    json_start = content.find('{')
    json_end = content.rfind('}') + 1
    json_content = content[json_start:json_end]
    
    # Parse the JSON
    data = json.loads(json_content)
    return data

def load_global_course_data(file_path: str) -> Dict[str, Any]:
    """Load the global course data JSON file."""
    with open(file_path, 'r', encoding='utf-8') as f:
        return json.load(f)

def update_course_data(raw_data: Dict[str, Any], global_data: Dict[str, Any]) -> Dict[str, Any]:
    """Update rawData with global course data for corners/straights/slopes."""
    updated_data = raw_data.copy()
    
    # Track statistics
    courses_updated = 0
    courses_not_found = 0
    
    print("Updating course data...")
    print("=" * 50)
    
    # Iterate through tracks in rawData
    for track_id, track_data in updated_data.items():
        if 'courses' not in track_data:
            continue
            
        track_name = track_data.get('name', f'Track {track_id}')
        print(f"\nProcessing {track_name} ({track_id}):")
        
        # Iterate through courses in this track
        for course_id, course_data in track_data['courses'].items():
            course_name = course_data.get('name', 'Unknown')
            
            # Check if this course exists in global data
            if course_id in global_data:
                global_course = global_data[course_id]
                
                # Update corners, straights, and slopes
                old_corners = len(course_data.get('corners', []))
                old_straights = len(course_data.get('straights', []))
                old_slopes = len(course_data.get('slopes', []))
                
                # Replace the data
                course_data['corners'] = global_course.get('corners', [])
                course_data['straights'] = global_course.get('straights', [])
                course_data['slopes'] = global_course.get('slopes', [])
                
                new_corners = len(course_data.get('corners', []))
                new_straights = len(course_data.get('straights', []))
                new_slopes = len(course_data.get('slopes', []))
                
                print(f"  {course_id} ({course_name}):")
                print(f"    Corners: {old_corners} → {new_corners}")
                print(f"    Straights: {old_straights} → {new_straights}")
                print(f"    Slopes: {old_slopes} → {new_slopes}")
                
                courses_updated += 1
            else:
                print(f"  {course_id} ({course_name}): NOT FOUND in global data")
                courses_not_found += 1
    
    print(f"\n" + "=" * 50)
    print(f"Summary:")
    print(f"  Courses updated: {courses_updated}")
    print(f"  Courses not found: {courses_not_found}")
    
    return updated_data

def format_json_for_kt(data: Dict[str, Any]) -> str:
    """Format the JSON data for insertion into the Kotlin file."""
    # Convert to JSON with proper formatting
    json_str = json.dumps(data, indent=2, ensure_ascii=False)
    
    # Add proper Kotlin formatting
    lines = json_str.split('\n')
    formatted_lines = []
    
    for i, line in enumerate(lines):
        # Add proper indentation for Kotlin
        if i == 0:  # First line with opening brace
            formatted_lines.append('internal val rawCourseData = """')
            formatted_lines.append(line)
        elif i == len(lines) - 1:  # Last line with closing brace
            formatted_lines.append(line)
            formatted_lines.append('"""')
        else:
            formatted_lines.append(line)
    
    return '\n'.join(formatted_lines)

def update_rawdata_kt(file_path: str, updated_data: Dict[str, Any]):
    """Update the rawData.kt file with the new course data."""
    with open(file_path, 'r', encoding='utf-8') as f:
        content = f.read()
    
    # Find the start and end of the rawCourseData definition
    start_marker = 'internal val rawCourseData = """'
    end_marker = '"""'
    
    start_pos = content.find(start_marker)
    if start_pos == -1:
        raise ValueError("Could not find rawCourseData definition in file")
    
    # Find the end of the rawCourseData definition
    end_pos = content.find(end_marker, start_pos + len(start_marker))
    if end_pos == -1:
        raise ValueError("Could not find end of rawCourseData definition in file")
    
    # Format the new data
    new_json_data = json.dumps(updated_data, indent=2, ensure_ascii=False)
    
    # Create the new content
    new_content = (
        content[:start_pos + len(start_marker)] + 
        '\n' + new_json_data + '\n' +
        content[end_pos:]
    )
    
    # Write the updated file
    with open(file_path, 'w', encoding='utf-8') as f:
        f.write(new_content)
    
    print(f"\nUpdated {file_path} successfully!")

def main():
    print("Course Data Update Script")
    print("=" * 50)
    
    # Load data
    print("Loading rawData.kt...")
    raw_data = parse_rawdata_kt('race/src/commonMain/kotlin/io/github/mee1080/umasim/race/data/rawData.kt')
    
    print("Loading global_course_data.json...")
    global_data = load_global_course_data('data/global_course_data.json')
    
    print(f"Found {len(raw_data)} tracks in rawData.kt")
    print(f"Found {len(global_data)} courses in global_course_data.json")
    
    updated_data = update_course_data(raw_data, global_data)
    
    update_rawdata_kt('race/src/commonMain/kotlin/io/github/mee1080/umasim/race/data/rawData.kt', updated_data)

if __name__ == "__main__":
    main()
