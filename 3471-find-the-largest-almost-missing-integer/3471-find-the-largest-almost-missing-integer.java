class Solution {
    public int largestInteger(int[] nums, int k) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        
        for (int i = 0; i <= nums.length - k; i++) {
            Map<Integer, Boolean> set = new HashMap<>();
            
            for (int j = i; j < i + k; j++) {
                if (!set.containsKey(nums[j])) {
                    set.put(nums[j], true);
                    
                    map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);
                }
            }
        }
        
       
        int result = -1;
        for(Integer i : map.keySet()){
            if (map.get(i) == 1) {
                result = Math.max(result, i);
            }
        }
        
        return result;
    }
}
