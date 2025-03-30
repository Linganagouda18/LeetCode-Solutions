class Solution {
    public int[] minCosts(int[] cost) {
        int ans[] = new int[cost.length];
        int n = cost.length;

    ans[0] = cost[0];

    for(int i=1;i<n;i++){
        ans[i] = Math.min(ans[i-1] , cost[i]);
    }
        return ans;
    }
}