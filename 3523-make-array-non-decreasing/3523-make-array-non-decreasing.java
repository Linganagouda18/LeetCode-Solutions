class Solution {
    public int maximumPossibleSize(int[] nums) {
        int count = 0;
        int maxi = -1;

       for(int i=0;i<nums.length;i++){
        if(maxi <=nums[i]){
            count++;
            maxi = nums[i];
        }
       }
     return count;   
    }
}