class Solution {
    public int longestBalanced(int[] nums) {
        Set<Integer>set;
        Set<Integer>set1;
        int res = 0;
        int maxi = 0;

        for(int i=0;i<nums.length;i++){
            set = new HashSet<>();
            set1 = new HashSet<>();
           
            for(int j=i;j<nums.length;j++){
               if(nums[j] % 2 == 0){
                set.add(nums[j]);
               }else{
                set1.add(nums[j]);
               }

               if(set.size() == set1.size()) maxi = Math.max(j-i+1 , maxi);
            }
        }

        return maxi;
    }
}