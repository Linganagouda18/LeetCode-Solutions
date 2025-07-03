class Solution {
    public char kthCharacter(int k) {
        StringBuilder sb = new StringBuilder("a");

        while(sb.length() <k){
            int n = sb.length();

            for(int i=0;i<n;i++){
                char ch = sb.charAt(i);

                if(ch == 'z'){
                   char ch1 = 'a';
                   sb.append(ch1);
                }else{
                    char ch2 =(char) (ch +1);
                    sb.append(ch2);
                }
            }
        }
     return sb.charAt(k-1);   
    }
}