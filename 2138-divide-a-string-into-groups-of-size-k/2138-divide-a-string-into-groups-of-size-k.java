class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int a = n % k;
        int rem = (a == 0) ? 0 : k - a; 
        int z=0;


        while(rem != 0){
            s+= fill;
            rem--;
        }
        
         String ans[] = new String[s.length()/k];
       
        for(int i=0;i<s.length();i=i+k){
            if(z < s.length()/k)
            ans[z++] = s.substring(i,i+k);
        }

        return ans;
    }
}