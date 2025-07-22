// class Solution {
//     public int maxAreaOfIsland(int[][] grid) {
//         int n = grid.length;
//         int m = grid[0].length;
//         int maxi = 0;
//         boolean [][] vis = new boolean[n][m];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 if(grid[i][j] == 1 && !vis[i][j]){
//                  int  sum =  dfs(grid,i,j,1,vis);
//                    maxi = Math.max(maxi,sum);
//                 }
//             }
//         }
//         return maxi;
//     }

//     private int dfs(int grid[][] , int row , int col , int val,boolean [][] vis){
//         //boundary condition
//         if (row < 0 || row >= grid.length || col < 0 || vis[row][col] || col >= grid[0].length|| grid[row][col] == 0) {
//     return 0;
// }


//        vis[row][col] = true;
//         dfs(grid,row+1,col,val+1,vis);
//         dfs(grid,row-1,col,val+1,vis);
//         dfs(grid,row,col+1,val+1,vis);
//         dfs(grid,row,col-1,val+1,vis);

//         return val;
//     }
// } 


class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int maxi = 0;
        boolean [][] vis = new boolean[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1 && !vis[i][j]){
                    int sum = dfs(grid, i, j, 0, vis);  // Start with val = 0
                    maxi = Math.max(maxi, sum);
                }
            }
        }
        return maxi;
    }

    private int dfs(int[][] grid, int row, int col, int val, boolean[][] vis){
        // boundary conditions
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length 
            || vis[row][col] || grid[row][col] == 0) {
            return 0;
        }

        vis[row][col] = true;

 
        val = 1;

       
        val += dfs(grid, row + 1, col, 0, vis);
        val += dfs(grid, row - 1, col, 0, vis);
        val += dfs(grid, row, col + 1, 0, vis);
        val += dfs(grid, row, col - 1, 0, vis);

        return val;
    }
}
