class Solution {
    private void dfs(int curr , List<List<Integer>> ans , boolean vis[]){
        vis[curr] = true;

        for(int a : ans.get(curr)){
            if(!vis[a])
            dfs(a,ans,vis);
            // vis[a] = true;
        }
    }
    public int makeConnected(int n, int[][] connections) {
        List<List<Integer>>ans = new ArrayList<>();
        boolean vis[] = new boolean[n];
        int  count = 0;
        if(connections.length < n - 1) return -1;

        for(int i=0;i<n;i++){
            ans.add(new ArrayList<>());
        }

        for(int [] val : connections){
            int u = val[0];
            int v = val[1];

            ans.get(u).add(v);
            ans.get(v).add(u);
        }

        for(int i=0;i<n;i++){
            if(!vis[i] ){
                count++;
                dfs(i,ans,vis);
            }
        }
        return count-1;
    }
}