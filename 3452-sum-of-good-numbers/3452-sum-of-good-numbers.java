class Solution {
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum = 0;
        int  n = nums.length;

        for(int i=0;i<nums.length;i++){
            int a = i-k;
            int b = i+k;

            if(b >n-1){
                if(nums[i] > nums[a]){
                    sum += nums[i];
                }
            }else if(a < 0){
                if(nums[i] > nums[b]){
                    sum += nums[i];
                }
            }else if(nums[i] > nums[a] && nums[i] > nums[b]){
                sum +=nums[i];
            }
        }
        return sum;
    }
}