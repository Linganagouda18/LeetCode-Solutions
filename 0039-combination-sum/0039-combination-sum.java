class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer>ans = new ArrayList<>();

        helper(0,candidates,res,ans,target);
        return res;
    }

    private void helper(int start , int candidates[],List<List<Integer>> res,List<Integer>ans,int target){
        if(target == 0){
            res.add(new ArrayList<>(ans));
            return;
        }

        if(target < 0) return ;

        for(int i=start;i<candidates.length;i++){
            ans.add(candidates[i]);

            helper(i,candidates,res,ans,target-candidates[i]);
            //backtracking

            ans.remove(ans.size()-1);
        }
    }
}