class Solution {
    public String compressedString(String word) {
        int n = word.length();
        int count = 1;
        StringBuilder sb = new StringBuilder();
        if(word.length() == 1){
             sb.append(count);
            sb.append(word.charAt(0));
            return sb.toString();
        }

        for(int i=0;i<n-1;i++){
            char ch = word.charAt(i);
            char ch1 = word.charAt(i+1);



            if(ch == ch1 && count < 9){
                count ++;

               
            }else{
                if(count !=0){
                sb.append(count);
                sb.append(ch);
                count=1;
               
            }
            }
        }

        if(word.charAt(n-1) == word.charAt(n-2)){
            sb.append(count);
            sb.append(word.charAt(n-1));
        }else{
            sb.append(count);
        sb.append(word.charAt(n-1));
        }
        return sb.toString();
    }
}