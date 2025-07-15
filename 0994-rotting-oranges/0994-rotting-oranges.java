class Solution {
    static class Info {
        int row;
        int col;
        int count;

        public Info(int row , int col , int count){
            this.row = row;
            this.col = col;
            this.count = count;
        }
    }
    static int[]  dRow = {-1,1,0,0};
    static int[]  dCol = {0,0,-1,1};

    public int orangesRotting(int[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        int time = 0;
        int conorg = 0;
        int freshor = 0;


        Queue<Info> q = new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == 2){
                    q.add(new Info(i,j,0));
                }else if(grid[i][j] == 1){
                    freshor++;
                }
            }
        }


        while(!q.isEmpty()){
            Info curr = q.remove();
              int t = curr.count;
              time = t;

            for(int i=0;i<4;i++){
                int newRow = curr.row + dRow[i];
                int newCol = curr.col + dCol[i];

                if(newRow >=0 && newRow < n && newCol >=0 && newCol < m && grid[newRow][newCol] == 1){
                    grid[newRow][newCol] = 2;

                    conorg++;
                    q.add(new Info(newRow , newCol , t+1));

                }
            }
        }

     if(conorg == freshor ){
        return time;
     }   

     return -1;
    }
}