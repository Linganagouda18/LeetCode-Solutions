class Solution {
    public long maximumScore(int[] nums) {
        int n = nums.length;

        long prefix[] = new long[n];
        long suffix[] = new long[n];
        prefix[0] = nums[0];
        suffix[n-1] = nums[n-1];

        for(int i=1;i<n;i++){
            prefix[i] = prefix[i-1] + nums[i];
        }

        for(int i=n-2;i>=0;i--){
            suffix[i] = Math.min(suffix[i+1] , nums[i]);
        }

        long count = Long.MIN_VALUE;

        for(int i=0;i<n-1;i++){
            count = Math.max(prefix[i] -suffix[i+1] , count);
        }
        return count;
    }
}