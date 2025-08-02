class Solution {
    public int minRemoval(int[] nums, int k) {
        int j = 0;
        int i=0;
        int n = nums.length;
        int mini = 0;
        Arrays.sort(nums);

        while(j < n){
              
            while (nums[j] > (long) nums[i] * k) {
                i++;
            }
            mini = Math.max(mini, j - i + 1);
            j++;
        }
        return n-mini;
    }
}

// class Solution {
//     public int minRemoval(int[] nums, int k) {
//         Arrays.sort(nums);
//         int count = 0;
//         if(nums.length == 1)return 0;

//         for(int i=nums.length-1;i>=0;i--){
//             if(nums[i] <= nums[0] *k && i != 0){
//                 return count;
//             }else if(nums[i] > (long)nums[0] * k){
//                 count++;
//             }
//         }
//         return count;
//     }
// }