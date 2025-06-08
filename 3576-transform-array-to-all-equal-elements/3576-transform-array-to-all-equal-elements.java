class Solution {
    public boolean canMakeEqual(int[] nums, int k) {
        int count = 0;
        int n = nums.length;

        for(int i=0;i<n-1;i++){
            if(count <k){
                if(nums[i] == -1){
                    nums[i] *= -1;
                    nums[i+1] *= -1;
                    count++;
                }
            }
        }

        if(nums[nums.length-1] != -1 && count <= k)return true;

        for(int i=0;i<n-1;i++){
            if(count < k){
                if(nums[i] == 1){
                    nums[i] *= 1;
                    nums[i+1] *= 1;
                    count++;
                }
            }
        }
        
        if(nums[nums.length-1] != -1 && count <= k)return true;
        else return false;
    }
}