class Solution {
    public int findPeakElement(int[] nums) {

        if(nums.length == 2){
          if(nums[0] < nums[1])return 1;
          else return 0;
        }
        

        for(int i=1;i<=nums.length-1;i++){
            if(i == nums.length-1) {
                if(nums[i] > nums[i-1])return i;
            }
            if(nums[i-1] < nums[i] && nums[i] > nums[i+1]){
                return i;
            }
        }
        return 0;
    }
}