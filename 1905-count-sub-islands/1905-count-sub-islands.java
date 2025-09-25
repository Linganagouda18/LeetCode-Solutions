class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int n = grid1.length;
        int m = grid1[0].length;
        int count = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid2[i][j] == 1){
                   if(dfs(i,j,grid1,grid2)){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private boolean dfs(int i , int j,int grid1[][] , int grid2[][]){

        int rows = grid1.length;
        int cols = grid1[0].length;
        if(i < 0 || j < 0 || i>=rows || j >= cols || grid2[i][j] == 0)return true;

        grid2[i][j] = 0;
        boolean island = grid1[i][j] ==1;

        boolean l = dfs(i+1,j,grid1,grid2);
        boolean r = dfs(i-1,j,grid1,grid2);
        boolean b = dfs(i,j+1,grid1,grid2);
        boolean t = dfs(i,j-1,grid1,grid2);

        return l && r && b && t && island;

}
}