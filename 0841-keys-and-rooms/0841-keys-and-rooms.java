class Solution {
    private void  dfs(int curr , List<List<Integer>> rooms , boolean vis[]){
        vis[curr] = true;

        for(int val : rooms.get(curr)){
            if(!vis[val]){
                dfs(val ,rooms , vis );
            }
        }
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean []vis = new boolean[n];
        int count = 0;

        for(int i=0;i<n;i++){
            if(!vis[i] && count == 0){
                count++;
                dfs(i , rooms , vis);
            }
        }

        for(int i=0;i<vis.length;i++){
            if(!vis[i]) return false;
        }
        return true;
    }
}