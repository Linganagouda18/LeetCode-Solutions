class Solution {
    static class Edge{
        int src;
        int dest;

        public Edge(int src, int dest){
            this.src =src;
            this.dest=dest;
        }
    }

    static int[] dRow = {-1,1,0,0};
    static int[] dCol = {0,0,-1,1};

    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        boolean vis[][] = new boolean[n][m];
        Queue<Edge>q = new LinkedList<>();


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j] == 0){
                    vis[i][j] = true;
                    q.add(new Edge(i,j));
                }
            }
        }
 if(q.isEmpty()||q.size()==n*m)return mat;
        while(!q.isEmpty()){
            Edge curr = q.remove();

            for(int i=0;i<4;i++){
                int row = dRow[i]+curr.src;
                int col = dCol[i] + curr.dest;

                if(row >=0 && col >= 0 && row < n && col < m && !vis[row][col]){
                    vis[row][col] = true;
                    mat[row][col] = mat[curr.src][curr.dest]+1;
                    q.add(new Edge(row,col));
                }
            }
        }
return mat;
        
    }
}