class Solution {
   
    static class Info{
        int src;
        int dest;

        public Info(int src,int dest){
            this.src= src;
            this.dest =dest;
        }
    }

    static int[] dRow = {-1,1,0,0};
    static int[] dCol = {0,0,-1,1};


    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
         int n = image.length;
    int m = image[0].length;
        Queue<Info>q = new LinkedList<>();
        int value = image[sr][sc];
       

        // Early return if starting pixel already has the target color
        if (value == color) return image;
        q.add(new Info(sr,sc));


        while(!q.isEmpty()){
            Info curr = q.remove();
            // image[curr.src][curr.dest] = color;
            image[sr][sc] = color;

            for(int i=0;i<4;i++){
                int newRow = curr.src + dRow[i];
                int newCol = curr.dest + dCol[i];

                if(newRow >=0 && newCol >=0 && newRow < n && newCol <m && image[newRow][newCol] == value){
                    image[newRow][newCol] = color;
                    q.add(new Info(newRow ,newCol));
                }
            }
        }

        return image;
    }
} 