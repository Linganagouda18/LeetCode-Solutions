class Solution {
    public String minRemoveToMakeValid(String s) {
        String str = "";
        StringBuilder sb = new StringBuilder();
        int open = 0;
        int close = 0;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(')open++;
            if(ch == ')')close++;

            if(open < close){
                close -= 1;
                continue;
            }else if(open >= close){
                str += ch;
            }
        }

        open = 0;
        close = 0;
        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);

            if(ch == '(')open++;
            if(ch == ')')close++;
            if(close < open){
                open -= 1;
            }else if(close >= open){
                sb.append(ch);
            }
        }

        return sb.reverse().toString();
    }
}