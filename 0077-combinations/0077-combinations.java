class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>res = new ArrayList<>();
        List<Integer>ans = new ArrayList<>();

        helper(1 , ans , res,k,n);
        return res;
    }


    private void helper(int a , List<Integer>ans , List<List<Integer>>res , int k,int n){
        if(ans.size() == k){
            res.add(new ArrayList<>(ans));
            return;
        }


        for(int i=a;i<=n;i++){
        ans.add(i);
        helper(i+1 , ans , res, k,n);
        ans.remove(ans.size() - 1);
        }

    }
}