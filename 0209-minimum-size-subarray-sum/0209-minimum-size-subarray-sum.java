class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j=0;
        int mini = Integer.MAX_VALUE;
        int n = nums.length;
        int sum = 0;

        while(j < n){
            sum += nums[j];

            while(sum >=target ){
                mini = Math.min(mini,j-i+1);
                sum -= nums[i];
                i++;
            }
            j++;
                    }
                    if(mini == Integer.MAX_VALUE) return 0;
                    else return mini;        
    }
}