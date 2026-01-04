class Solution {
    public int sumFourDivisors(int[] nums) {
        
        Arrays.sort(nums);
        int len = nums.length;
        int n = nums[len-1];
        int maxi = 0;
       

        for(int i=0;i<len;i++){
          
           int res = helper(nums[i]);
          maxi += res;
        }
        return maxi;
    }

        private int helper(int val){
            int c=0;
            int count=0;
            for(int i=1;i<=val;i++){
                if(val < i) break;
                if(val % i == 0 && count<=4){
                    c += i;
                    count++;
                }
            
        }
        if(count == 4) return c;
        return 0;
    }
}