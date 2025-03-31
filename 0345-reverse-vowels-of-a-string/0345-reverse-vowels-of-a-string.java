class Solution {
    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    public String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char leftChar = sb.charAt(i);
            char rightChar = sb.charAt(j);

            if (isVowel(leftChar) && isVowel(rightChar)) {
                sb.setCharAt(i, rightChar);
                sb.setCharAt(j, leftChar);
                i++;
                j--;
            } else {
                if (!isVowel(leftChar)) {
                    i++;
                }
                if (!isVowel(rightChar)) {
                    j--;
                }
            }
        }

        return sb.toString();
    }
}
