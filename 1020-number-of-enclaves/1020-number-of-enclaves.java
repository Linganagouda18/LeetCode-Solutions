class Solution {
     static int[] dRow = {-1,1,0,0};
     static int[] dCol = {0,0,-1,1};
   
    private void dfs(int a , int b , boolean vis[][] , int grid[][]){
        vis[a][b] = true;
        int n = grid.length;
        int m = grid[0].length;

        for(int i=0;i<4;i++){
            int row = a + dRow[i];
            int col = b + dCol[i];

            if(row >=0 && col >=0 && row < n && col <m && !vis[row][col] && grid[row][col] == 1){
                dfs(row,col,vis,grid);
            }
        }

    }
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean vis[][] = new boolean[n][m];
        int count = 0;

        //check the boundaty condition:

          for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((i == 0 || j == 0 || i == n - 1 || j == m - 1) && grid[i][j] == 1) {
                    dfs(i,j,vis,grid);
                }
            }
        }

       
        //loop through the array check if grid[i][j] == 1 increment the count

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 1 && !vis[i][j]){
                    count++;
                    // vis[i][j] = true;
                }
            }
        }
        return count;
    }
}