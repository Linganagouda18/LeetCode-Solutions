class Solution {
    public String removeDigit(String number, char digit) {
        int n = number.length();
      StringBuilder sb = new StringBuilder();
        int count = 0;

        for(int i=0; i<n;i++){
            char ch = number.charAt(i);

            if(ch == digit){
                StringBuilder s= new StringBuilder(number);
                s.deleteCharAt(i);
                if(s.compareTo(sb) > 0){
                    sb = s;
                }
            }
        }
return sb.toString();

        // for(int i=0;i<n;i++){
        //     char ch = number.charAt(i);

        //     if(ch == digit && count == 0){
        //         count++;
        //         continue;
        //     }else{
        //         str +=ch;       
        //     }
        // }
        // return str;
    }
}