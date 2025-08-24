class Solution {
    public int longestSubarray(int[] nums) {
        int count =0;
        int maxi = Integer.MIN_VALUE;

        int i = 0;
        int j = 0;

        while(j < nums.length){
            if(nums[j] == 1){
                maxi = Math.max(maxi,j-i);
            }else if(nums[j] == 0){
                count ++;

                while(count > 1){
                    if(nums[i] == 0){
                        count--;
                    }
                    i++;      
                }
            }
                 maxi = Math.max(maxi,j-i);
                j++;
        }
        return maxi;
    }
}