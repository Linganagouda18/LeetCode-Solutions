class Solution {
    public int percentageLetter(String s, char letter) {
        int freq = 0;
        int n = s.length();
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);

         if(ch == letter)freq++;
        }
        return (freq * 100)/n;
    }
}