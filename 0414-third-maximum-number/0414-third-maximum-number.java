class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<=2)return nums[nums.length-1];
        int count = 0;

        for(int i=nums.length-1;i>0;i--){
            if(nums[i] != nums[i-1])count++;
            if(count == 2)return nums[i-1];
        }

        return nums[nums.length-1];
    }
}