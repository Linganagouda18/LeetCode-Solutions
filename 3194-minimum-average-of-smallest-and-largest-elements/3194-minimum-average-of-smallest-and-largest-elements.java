class Solution {
    public double minimumAverage(int[] nums) {
       
        double maxi = Integer.MAX_VALUE;
        int n = nums.length;
        Arrays.sort(nums);


        for(int i=0;i<n/2;i++){
            

            double sum = (nums[i] + nums[n - i - 1]) / 2.0;
             maxi = Math.min(maxi , sum);
        }
 return maxi;
        
    }
}