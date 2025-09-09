#!/usr/bin/env python3
"""
Script to directly update the character mapping in both SkillInput.kt and SkillOperation.kt from umas.json.
This script reads umas.json and updates the charaIdToDisplayName map in both files.
"""

import json
import sys

def unique_skill_for_uma(oid):
    """Convert outfit ID to unique skill ID using the formula."""
    i = int(oid[1:-2])  # Base character ID
    v = int(oid[-2:])    # Variant number
    sid = 100000 + 10000 * (v - 1) + i * 10 + 1
    return str(sid)

def generate_chara_mapping():
    """Generate character mapping from umas.json."""
    try:
        with open('data/umas.json', 'r', encoding='utf-8') as f:
            umas_data = json.load(f)
    except FileNotFoundError:
        print("Error: data/umas.json not found")
        return None
    
    mapping = {}
    
    for chara_id, chara_data in umas_data.items():
        chara_name = chara_data['name'][1]  # English name
        outfits = chara_data.get('outfits', {})
        
        for outfit_id, outfit_name in outfits.items():
            # Calculate expected skill ID
            expected_skill_id = unique_skill_for_uma(outfit_id)
            
            # Create the display name
            display_name = f"{outfit_name} {chara_name}"
            
            # Store mapping from skill ID to display name
            mapping[expected_skill_id] = display_name
    
    return mapping

def update_file(file_path, mapping):
    """Update a file with the new character mapping."""
    try:
        with open(file_path, 'r', encoding='utf-8') as f:
            lines = f.readlines()
    except FileNotFoundError:
        print(f"Error: {file_path} not found")
        return False
    
    # Find the start and end of the charaIdToDisplayName map
    start_line = -1
    end_line = -1
    
    for i, line in enumerate(lines):
        if 'private val charaIdToDisplayName = mapOf(' in line:
            start_line = i
        elif start_line != -1 and line.strip() == ')':
            end_line = i
            break
    
    if start_line == -1 or end_line == -1:
        print(f"Error: Could not find the charaIdToDisplayName mapping in {file_path}")
        return False
    
    # Generate the new mapping lines
    new_mapping_lines = []
    for skill_id, display_name in sorted(mapping.items()):
        new_mapping_lines.append(f'    "{skill_id}" to "{display_name}",\n')
    
    # Replace the content between start_line and end_line
    new_lines = lines[:start_line + 1] + new_mapping_lines + lines[end_line:]
    
    # Write the updated content back to the file
    with open(file_path, 'w', encoding='utf-8') as f:
        f.writelines(new_lines)
    
    return True

def main():
    mapping = generate_chara_mapping()
    if mapping is None:
        sys.exit(1)
    
    print("Generated character mapping:")
    for skill_id, display_name in sorted(mapping.items()):
        print(f"  {skill_id}: {display_name}")
    
    print(f"\nTotal characters: {len(mapping)}")
    
    # Update both files
    files_to_update = [
        'compose/src/commonMain/kotlin/io/github/mee1080/umasim/compose/pages/race/SkillInput.kt',
        'compose/src/commonMain/kotlin/io/github/mee1080/umasim/store/operation/SkillOperation.kt'
    ]
    
    success_count = 0
    for file_path in files_to_update:
        if update_file(file_path, mapping):
            print(f"Successfully updated {file_path}")
            success_count += 1
        else:
            print(f"Failed to update {file_path}")
    
    if success_count == len(files_to_update):
        print(f"\nAll {len(files_to_update)} files updated successfully!")
    else:
        print(f"\nOnly {success_count}/{len(files_to_update)} files updated successfully.")
        sys.exit(1)

if __name__ == "__main__":
    main()
