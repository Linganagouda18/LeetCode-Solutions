class Solution {
    public int maximumDifference(int[] nums) {
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            mini = Math.min(nums[i] , mini);
            maxi = Math.max(maxi , nums[i] - mini);
        }

        if(maxi ==0)return -1;
        else return maxi;
        
    }
}