class Solution {
    public int maxDifference(String s) {
        int n = s.length();
        int count = Integer.MAX_VALUE;
        int ans[] = new int[26];
        int count1 = Integer.MIN_VALUE;
        // int maxi = 0;

        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            ans[ch-'a']++;
        }

        Arrays.sort(ans);

        for(int i=0;i<ans.length;i++){
            if(ans[i] > 0){
                if(ans[i] % 2 ==0){
                    count = Math.min(count,ans[i]);
                }else{
                    count1 = Math.max(count1,ans[i]);
                }
            }

        }
      return count1-count;
    }
}