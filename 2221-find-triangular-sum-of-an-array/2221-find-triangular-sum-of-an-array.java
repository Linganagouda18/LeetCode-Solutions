class Solution {
    public int triangularSum(int[] nums) {
        List<Integer>ans = new ArrayList<>();

        for(int i : nums) ans.add(i);

        while(ans.size() >1){
            for(int i=0;i<ans.size()-1;i++){
               int res = (ans.get(i) +  ans.get(i+1))% 10 ;
               ans.set(i,res);
            }
            ans.remove(ans.size()-1);
        }
        return ans.get(0);
    }
}