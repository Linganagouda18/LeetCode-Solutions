class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>ans = new ArrayList<>();
        HashSet<Integer>set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(set.size() > 0 && set.contains(nums[i])){
                ans.add(nums[i]);
            }
            set.add(nums[i]);
        }

        return ans;
    }
}