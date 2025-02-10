class Solution {
    public String clearDigits(String s) {
        String str="";
        Stack<Character>st = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(Character.isDigit(ch)){
                st.pop();
            }else{
                st.push(ch);
            }
        }
String str1 = "";
        while(!st.isEmpty()){
            str +=st.pop();
        }

        for(int i=str.length()-1;i>=0;i--){
            str1 +=str.charAt(i);
        }

        return str1;
    }
}