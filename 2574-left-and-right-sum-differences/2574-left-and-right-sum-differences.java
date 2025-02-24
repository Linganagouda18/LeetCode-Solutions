// class Solution {
//     public int[] leftRightDifference(int[] nums) {
//         int ans[] = new int[nums.length];
//         int ans1[] = new int[nums.length];
//         int ans2[] = new int[nums.length];
//         int sum = 0;
//         int sum1 = 0;

//         for(int i=1;i<nums.length;i++){
//            ans[i] = nums[i-1] + ans[i-1];
//         }

//         for(int i=nums.length-2;i>=0;i--){
//             ans1[i] = ans1[i+1] + nums[i+1];
//         }

//         for(int i=0;i<nums.length;i++){
//             ans2[i] = Math.abs(ans[i] - ans1[i]);
//         }
//         return ans2;
//     }
// }

class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        
        
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            answer[i] = leftSum; 
            leftSum += nums[i];  
        }
        
      
        int rightSum = 0;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = Math.abs(answer[i] - rightSum); 
            rightSum += nums[i]; 
        }
        return answer;
    }
}
