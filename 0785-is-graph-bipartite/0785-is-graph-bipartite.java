class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int col[] = new int[n];
        Arrays.fill(col , -1);

        for(int i=0;i<n;i++){
            if(col[i] == -1){
                if(!bfs(i,graph,col)){
                    return false;
                }
            }
        }
        return true;
    }

    private boolean bfs(int val , int graph[][] , int col[]){
        Queue<Integer>q = new LinkedList<>();
        q.add(val);
        col[val] = 0;

        while(!q.isEmpty()){
            int curr = q.remove();

            for(int neigh : graph[curr]){
                if(col[neigh] == -1){
                    int nextCol = col[curr] == 0 ? 1 : 0;
                    col[neigh] = nextCol;
                    q.add(neigh);
                }else if(col[neigh] == col[curr]){
                    return false;
                }
            }
        }

        return true;
    }
}