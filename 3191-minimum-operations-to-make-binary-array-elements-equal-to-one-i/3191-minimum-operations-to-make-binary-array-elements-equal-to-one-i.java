class Solution {
    public int minOperations(int[] nums) {
        int cnt = 0;

        for(int i=0;i<=nums.length-3;i++){
            int count = 0;
            if(nums[i] == 0){
            for(int j=i;j<=i+2;j++){
                if(nums[j] == 0){
                    nums[j] = 1;
                    count++;
                }else if(nums[j] == 1){
                    nums[j] = 0;
                    count++;
                }

            }
                if(count>0)cnt++;
            }
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0)return -1;
        }

        return cnt;
        
    }
}