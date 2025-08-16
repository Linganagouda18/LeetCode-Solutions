class Solution {
    public int maximum69Number (int num) {
        String str = String.valueOf(num);

        StringBuilder sb = new StringBuilder();
        int count = 0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch == '6' && count == 0){
                sb.append('9');
                count++;
            }else{
                sb.append(ch);
            }
        }

        return Integer.parseInt(sb.toString());
    }
}