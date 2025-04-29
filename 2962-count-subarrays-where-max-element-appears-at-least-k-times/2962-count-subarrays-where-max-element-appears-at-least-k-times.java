class Solution {
    public long countSubarrays(int[] nums, int k) {

        int i = 0;
        int j = 0;
        int n = nums.length;
        int count = 0;



        int maxi = Integer.MIN_VALUE;
        long res = 0;

        for(int a=0;a<nums.length;a++){
            if(nums[a] > maxi){
                maxi = nums[a];
            }
        }


        while(j < n){
            if(nums[j] == maxi){
                count++;
            }

            while(count >=k){
                if(nums[i] == maxi)count--;
                i++;
            }
            res += i;
            j++;
        }

        // for(int i=0;i<nums.length;i++){
        // int count = 0;
        //     for(int j=i;j<nums.length;j++){
        //         if(nums[j] == maxi ){
        //             count++;
                    
        //         }

        //         if(count >= k){
        //             res += nums.length-j;
        //             break;
        //         }

        //     }
        // }
        return res;
    }
}