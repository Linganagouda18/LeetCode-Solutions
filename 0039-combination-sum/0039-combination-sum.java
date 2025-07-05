class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>res = new ArrayList<>();
        List<Integer>ans = new ArrayList<>();
         Arrays.sort(candidates); 

        helper(candidates , 0 , ans , res , target , 0);
        return res;
    }

    private void helper(int candidates[] , int i , List<Integer>ans , List<List<Integer>>res , int target , int sum){

        if(sum == target){
            res.add(new ArrayList<>(ans));
            return;
        }

        if(sum > target || i>= candidates.length)return;

        ans.add(candidates[i]);

        helper(candidates , i , ans , res , target , sum + candidates[i]);
        ans.remove(ans.size()-1);
        helper(candidates , i+1 , ans ,res ,target , sum);
    }
}