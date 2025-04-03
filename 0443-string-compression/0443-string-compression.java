class Solution {
    public int compress(char[] chars) {
        int index = 0; // Pointer to modify chars in-place
        int i = 0;
        
        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;
            
            // Count occurrences of the current character
            while (i < chars.length && chars[i] == currentChar) {
                count++;
                i++;
            }
            
            // Store the character
            chars[index++] = currentChar;
            
            // If count > 1, store the count as characters
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[index++] = c;
                }
            }
        }
        
        return index; // New length of modified chars array
    }
}
