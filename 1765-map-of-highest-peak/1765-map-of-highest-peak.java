class Solution {
    static class Info{
        int src;
        int dest;
        int value;

        public Info(int src, int dest , int value){
            this.src= src;
            this.dest=dest;
            this.value=value;
        }
    }


    static int[] dRow = {-1,1,0,0};
    static int[] dCol = {0,0,-1,1};
    public int[][] highestPeak(int[][] isWater) {
        int n = isWater.length;
        int m = isWater[0].length;

        boolean vis[][] = new boolean[n][m];
        int ans[][] = new int[n][m];

        Queue<Info>q = new LinkedList<>();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(isWater[i][j] == 1){
                    ans[i][j] = 0;
                    vis[i][j] = true;
                    q.add(new Info(i,j,0));
                }else{
                    ans[i][j] = -1;
                }
            }
        }

        while(!q.isEmpty()){
            Info curr = q.remove();
            // int val = curr.value;
            // vis[curr.src][curr.dest] = true;

            // ans[curr.src][curr.dest] = curr.value;

            for(int i=0;i<4;i++){

                int row = dRow[i] + curr.src;
                int col = dCol[i] + curr.dest;


                if(row >=0 && col >=0 && row < n && col <m && !vis[row][col]){
                    ans[row][col] = curr.value+1;
                    vis[row][col] = true;
                    q.add(new Info(row,col ,curr.value+1));
                   
                }
            }

        }
        return ans;
    }
}