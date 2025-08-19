class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long maxi = 0;
        long sum = 0;

        int j = 0;

        while(j<nums.length){
            long count = 0;
            if(nums[j] == 0){
                while(nums[j] == 0 && j < nums.length){
                    count++;
                    
                    // maxi = Math.max(maxi ,;
                    if(j == nums.length-1)  break;
                   j++;
                }

                sum +=  ((count+1)*count)/2;
            }
           if(j < nums.length) j++;
        }

        return sum;
    }
}