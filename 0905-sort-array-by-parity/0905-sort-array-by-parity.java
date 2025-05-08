class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int ans[] = new int[nums.length];
        int a = nums.length-1;
        int b = 0;

      for(int i=0;i<nums.length;i++){
        if(nums[i] % 2 == 0){
            ans[b++] = nums[i];
        }else{
            ans[a--] = nums[i];
        }
      }
return ans;

    }
}