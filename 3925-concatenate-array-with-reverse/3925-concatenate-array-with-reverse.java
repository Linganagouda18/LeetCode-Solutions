class Solution {
    public int[] concatWithReverse(int[] nums) {
        int ans[] = new int[nums.length *2];
        int a = 0;

        for(int i=0;i<nums.length;i++){
            ans[a] = nums[i];
            a++;
        }

        for(int i=nums.length-1;i>=0;i--){
            ans[a] = nums[i];
            a++;
        }

        return  ans;
    }
}