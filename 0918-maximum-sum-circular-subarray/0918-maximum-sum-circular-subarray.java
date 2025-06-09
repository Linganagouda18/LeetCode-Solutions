class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int globalmax = nums[0];
        int globalmin = nums[0];

        int currmin = 0;
        int currmax = 0;
        int sum = 0;


        for(int i=0;i<nums.length;i++){
            sum += nums[i];

            currmax = Math.max(currmax + nums[i] , nums[i]);
            globalmax = Math.max(currmax , globalmax);


            currmin = Math.min(currmin + nums[i] , nums[i]);
            globalmin = Math.min(globalmin , currmin);

        }

        if(globalmax < 0)return globalmax;
        int cirmax = sum - globalmin;

        return Math.max(globalmax , cirmax);
        
    }
}