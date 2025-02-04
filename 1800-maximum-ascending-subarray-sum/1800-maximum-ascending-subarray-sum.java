class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum = nums[0];
        int mxi =nums[0];

        for(int i=1;i<nums.length;i++){
            if(nums[i-1] < nums[i]){
                sum += nums[i];
                mxi = Math.max(mxi , sum);
            }else {
                // mxi = Math.max(mxi,sum+=nums[i]);
                sum = 0;
                sum +=nums[i];
            }
        }
return mxi;
        
    }
}