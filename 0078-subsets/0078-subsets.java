class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer>ans = new ArrayList<>();

        helper(0,nums,res,ans);
        return res;
    }

    private void helper(int start ,int nums[],List<List<Integer>> res,List<Integer>ans){
        res.add(new ArrayList<>(ans));

        for(int i=start;i<nums.length;i++){
            ans.add(nums[i]);
            helper(i+1,nums,res,ans);

            //backtracking
            ans.remove(ans.size()-1);
        }
    }
}