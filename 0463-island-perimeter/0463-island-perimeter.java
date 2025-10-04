class Solution {
    public int islandPerimeter(int[][] grid) {
            int count = 0;
            int n = grid.length;
            int m = grid[0].length;

            for(int i=0; i<n;i++){
                for(int j=0;j<m;j++){
                    if(grid[i][j] == 1){
                        count += dfs(i,j,grid);
                    }
                }
            }

            return count;
    }

    private int dfs(int i , int j , int grid[][]){
        //base case

        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j] == 0) return 1;

        //vis true
      if(grid[i][j] == -1) return 0;

      grid[i][j] = -1;

        return (
            dfs(i+1,j,grid) +
            dfs(i-1,j,grid) +
            dfs(i,j+1,grid) +
            dfs(i,j-1,grid));
        
    }
}