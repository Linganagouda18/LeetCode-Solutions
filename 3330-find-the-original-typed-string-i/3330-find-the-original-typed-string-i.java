class Solution {
    public int possibleStringCount(String word) {
        int count = 1;


        for(int i=1;i<word.length();i++){
            char ch = word.charAt(i-1);
            char ch1 = word.charAt(i);

            if(ch == ch1)count++;
        }

        return count;
    }
}