class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxi = 1;

        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length-1;j++){
                if(nums[j] < nums[j+1]){
                    maxi = Math.max(maxi,j+1-i+1);
                }else{
                    break;
                }
            }
        }

        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length-1;j++){
                if(nums[j] > nums[j+1]){
                    maxi = Math.max(maxi,j-i+1+1);
                }else{
                    break;
                }
            }
        }
        return maxi;
    }
}