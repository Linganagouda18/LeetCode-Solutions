class Solution {
    public int numberOfSubstrings(String s) {
        int ans[] = new int[3];
        int i=0;
        int n = s.length();
        int maxi =0;
        

        for(int j=0; j<s.length(); j++){
            char ch = s.charAt(j);
            ans[ch - 'a']++;

            while(ans[0] >=1 && ans[1] >=1 && ans[2] >=1){
                 maxi += n-j;

                ans[s.charAt(i) - 'a']--;
                i++;
            }

        }

        return maxi;
        
    }
}