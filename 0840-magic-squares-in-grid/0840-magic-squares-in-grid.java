class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int count = 0;
        int n = grid.length;
        int m = grid[0].length;
        if(n <3 || m < 3) return 0;
        int target = grid[0][0] + grid[0][1] + grid[0][2];

        for(int i=0;i<n-2;i++){
            for(int j=0;j<m-2;j++){
                if(isSafe(i , j , grid,target)) count++;
            }
        }

        return count;
    }

    private boolean isSafe(int a,int b,int grid[][],int tar){
        Set<Integer>set = new HashSet<>();
        for(int x=a;x<a+3;x++){
            int sum = 0;
            for(int y=b;y<b+3;y++){
                if(grid[x][y] > 9 || grid[x][y] < 1) return false;
                if(set.contains(grid[x][y]) ) return false;
                set.add(grid[x][y]);
                sum+= grid[x][y];
            }
            if(sum != tar) return false;
        }

         // Column check
    for (int y = b; y < b + 3; y++) {
        int sum = 0;
        for (int x = a; x < a + 3; x++) {
            sum += grid[x][y];
        }
        if (sum != tar) return false;
    }

        //diagonal sum
        int dia1 = grid[a][b] + grid[a+1][b+1] + grid[a+2][b+2];
        int dia2 = grid[a][b+2] + grid[a+1][b+1] + grid[a+2][b];

       

       return dia1 == tar && dia2 == tar;

    }
}