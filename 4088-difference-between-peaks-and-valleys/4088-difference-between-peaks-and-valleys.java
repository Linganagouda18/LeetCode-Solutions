class Solution {
    public int peakValleyDifference(int[] nums) {
        int n = nums.length;

        int a1 = 0;
        int a2 = 0;

        for(int i=1;i<n-1;i++){
            //peak
            if(nums[i-1] < nums[i] && nums[i] > nums[i+1]) a1 += nums[i];

            //valley
            if(nums[i-1] > nums[i] && nums[i] < nums[i+1]) a2 += nums[i];
        }

        return a1-a2;

        
    }
}