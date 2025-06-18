class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //  ans.add(Arrays.asList(nums[i], nums[left], nums[right]));

         List<List<Integer>>ans = new ArrayList<>();
         int n = nums.length;
         Arrays.sort(nums);


         for(int i=0;i<n-2;i++){
            int a = nums[i];
   if (i > 0 && nums[i] == nums[i - 1]) continue;
               int j=i+1;
               int k = nums.length-1;

               while( j < k){
                int sum = nums[i] + nums[j] + nums[k];

                if(sum == 0){
                      ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                      j++;
                      k--;
                      while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }else if(sum < 0){
                    j++;
                }else{
                    k--;
                }
               }
         }
return ans;
    }
}