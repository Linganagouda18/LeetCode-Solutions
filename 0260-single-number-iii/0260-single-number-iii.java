class Solution {
    public int[] singleNumber(int[] nums) {
        int ans[] = new int[2];
        int a = 0;
        HashMap<Integer,Integer>set = new HashMap<>();
        // Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            set.put(nums[i] , set.getOrDefault(nums[i],0)+1);
        }

        for(Integer i:set.keySet()){
            if(set.get(i) == 1){
                ans[a] = i;
                a++;
            }
        }

return ans;
        
    }
}