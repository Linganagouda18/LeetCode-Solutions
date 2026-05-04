class Solution {
    public List<List<Integer>> permute(int[] nums) {
     List<List<Integer>> res = new ArrayList<>();
     List<Integer>ans = new ArrayList<>();

     helper(nums,ans,res);   
     return res;
    }

    private void helper(int nums[] , List<Integer>ans , List<List<Integer>>res){
        if(ans.size() == nums.length) {
        res.add(new ArrayList<>(ans));
        return;
        }

        for(int i=0;i<nums.length;i++){
            if(ans.contains(nums[i])) continue;
            ans.add(nums[i]);
            helper(nums,ans,res);

            //backtracking
            ans.remove(ans.size()-1);
        }
    }


}