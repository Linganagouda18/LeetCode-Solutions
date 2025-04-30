class Solution {
      public boolean isEven(int x){
        int c = 0;
        while(x >0){
            x/=10;
           c++;
        }

        if(c % 2 == 0)return true;
        else return false;
    }
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int count = 0;

        for(int i=0;i<nums.length;i++){
            if(isEven(nums[i]))count++;
        }
        return count;
    }
}