class Solution {
    public String largestOddNumber(String num) {
        Stack<Character>s = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = num.length();

        for(int i=n-1; i>=0; i--){
            char ch = num.charAt(i);
            int a = ch - '0';
            if(a % 2 != 0) s.push(ch);
            else if (a % 2 == 0 && s.size() > 0)s.push(ch); 
        }
        if(s.isEmpty())return "";

        while(!s.isEmpty()){
            sb.append(s.pop());
        }

        return sb.toString();

        
    }
}