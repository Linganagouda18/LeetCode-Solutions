class Solution {
    public boolean validPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        int n = s.length();

        while(i<=j){
            char ch = s.charAt(i);
            char ch1 = s.charAt(j);

            if(ch != ch1){
                 boolean res = helper(s , i+1,j);
                 boolean res1 = helper(s ,i , j-1);
                if(res || res1)return true;
                 else return false;
            }
            i++;
            j--;
        }

        return true;
    }

    private boolean helper(String s, int i , int j){

        while(i<=j){
            char ch = s.charAt(i);
            char ch1 = s.charAt(j);

            if(ch != ch1)return false;
            i++;
            j--;
        }

        return true;
    }
}