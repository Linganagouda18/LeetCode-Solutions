class Solution {
    public int maximumSum(int[] nums) {
       
        HashMap<Integer,Integer>map = new HashMap<>();
        int maxi =-1;

        for(int i=0;i<nums.length;i++){

            int key = digit(nums[i]);

            if(map.containsKey(key)){
                maxi = Math.max(maxi,map.get(key)+nums[i]);
                map.put(key,nums[i]);
            }else{
                map.put(key,nums[i]);
            }
            
        }

        return maxi;
    }
       int digit(int temp){
            int sum = 0;
             while(temp > 0){
            sum +=temp % 10;
                temp /=10;
            }

            return sum;
        }
}


        //brute force approach  (72/84) passed

//         int ans[] = new int[nums.length];
//         int maxi = Integer.MIN_VALUE;

//         for(int i=0;i<nums.length;i++){
//             int sum = 0;
//             int temp = nums[i];

//             while(temp > 0){
//                 sum +=temp % 10;
//                 temp /=10;
//             }

//             ans[i] = sum;
//         }

//         for(int i=0;i<ans.length;i++){
//             for(int j=i+1;j<ans.length;j++){
//                 if(ans[i] == ans[j]){
//                     int a = nums[i] + nums[j];
//                     maxi = Math.max(maxi,a);
//                 }
//             }
//         }

//         if(maxi == Integer.MIN_VALUE) return -1;
//         else return maxi;
//     }
// }