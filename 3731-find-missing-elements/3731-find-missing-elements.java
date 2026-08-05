class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer>ans = new ArrayList<>();
        Arrays.sort(nums);
        Set<Integer>set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }

        int start = nums[0];
        int end = nums[nums.length-1];

        for(int i=start; i<end;i++){
           if(!set.contains(i)) ans.add(i);
        }
        return ans;
    }
}