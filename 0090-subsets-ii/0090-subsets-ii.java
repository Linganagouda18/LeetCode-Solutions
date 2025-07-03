class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>res = new ArrayList<>();
        List<Integer>ans = new ArrayList<>();

        helper(nums , 0 , ans, res);
        return res;
    }

    private void helper(int nums[] , int start , List<Integer>ans , List<List<Integer>>res){
        res.add(new ArrayList<>(ans));

        for(int i=start ;i<nums.length;i++){
            if(i > start && nums[i] == nums[i-1]) continue;
            ans.add(nums[i]);

            helper(nums , i+1 , ans, res);
            ans.remove(ans.size()-1);
        }
    }
}