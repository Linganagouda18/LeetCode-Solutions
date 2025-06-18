class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int ans[][] = new int[nums.length/3][nums.length];
        int n = nums.length;

        Arrays.sort(nums);

        // int i=0;
        // int j = n-1;

       for(int i=0; i<n;i+=3){
        if(nums[i+2] - nums[i] > k){
        return new int[0][0];
        }
        ans[i/3] = new int[]{nums[i] , nums[i+1] , nums[i+2]};
       }
        return ans;
    }
}