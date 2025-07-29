class Solution {
    static class Node {
        int src ;
        int dest;
        int val;

        public Node(int src, int dest , int val){
            this.src = src;
            this.dest=dest;
            this.val=val;
        }
    }
        static  int []dRow = {-1,-1,-1,0,1,1,1,0};
        static int []dCol = {-1,0,1,1,1,0,-1,-1};

    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean vis[][] = new boolean[n][m];

        //base case
      if (grid[0][0] != 0 || grid[n - 1][m - 1] != 0) return -1;

        Queue<Node>q = new LinkedList<>();
        q.add(new Node(0,0,1));

        while(!q.isEmpty()){
            Node curr = q.remove();

            int row = curr.src;
            int col = curr.dest;
            int value = curr.val;

            if(row == n-1 && col == m-1 ) return value;

            for(int i=0;i<8;i++){
                int r = dRow[i] + row;
                int c = dCol[i] + col;
               

               if(r < n && c < m && r >= 0 && c >=0 && !vis[r][c] && grid[r][c] == 0){
                q.add(new Node(r,c,value+1));
                vis[r][c] = true;
               }
            }
        }


        return -1;
    }
}