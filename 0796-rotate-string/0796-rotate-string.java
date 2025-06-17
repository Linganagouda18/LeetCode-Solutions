class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        int m = goal.length();
        StringBuilder sb = new StringBuilder();

        if(n != m )return false;
        char ch = s.charAt(0);

        for(int i=0; i<m;i++){
            char ch1 = goal.charAt(i);
            if(ch == ch1){
                sb.append(goal.substring(i,m));
                sb.append(goal.substring(0,i));
                break;
            }
        }

        String str = sb.toString();

        return s.equals(str);


        
        
    }
}