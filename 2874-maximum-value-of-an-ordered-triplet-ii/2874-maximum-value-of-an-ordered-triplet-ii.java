class Solution {
    public long maximumTripletValue(int[] nums) {
        int leftmax[]= new int[nums.length];
        int rightmax[]= new int[nums.length];
        long maxi = 0;

        leftmax[0] = nums[0];
        rightmax[nums.length-1] = nums[nums.length-1];


        for(int i=1;i<nums.length;i++){
            leftmax[i] = Math.max(nums[i] , leftmax[i-1]);
        }

        for(int i=nums.length-2;i>=0;i--){
            rightmax[i] = Math.max(nums[i] , rightmax[i+1]);
        }


        for(int i=1;i<nums.length-1;i++){
            maxi = Math.max(maxi,(long)(leftmax[i-1] - nums[i])*rightmax[i+1]);
        }
        
        return maxi;
    }
}