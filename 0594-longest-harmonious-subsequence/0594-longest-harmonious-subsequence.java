class Solution {
    public int findLHS(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer>map = new HashMap<>();
        int len = 0;

        for(int i=0;i<n;i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0)+1);
        }

        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i] -1)){
                len = Math.max(len , map.get(nums[i]) + map.get(nums[i]-1));
            }

            if(map.containsKey(nums[i]+1)){
                len = Math.max(len , map.get(nums[i]) + map.get(nums[i]+1));
            }
        }

        return len;
    }
}