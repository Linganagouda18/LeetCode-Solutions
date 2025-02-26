class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
       
       for(int i=0;i<nums.length;i++){
        sum += nums[i];


        if(sum > maxi) maxi = sum;
        if(sum < mini ) mini = sum;
       }
return Math.abs(maxi-mini);
        
    }
}