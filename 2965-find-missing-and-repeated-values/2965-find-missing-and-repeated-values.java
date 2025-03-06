class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        // HashMap<Integer,Integer>map = new HashMap<>();
        int n = grid.length;
        int arr[]=new int[n*n+1];
        int missing = -1;
        int rap = -1;


        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
             arr[grid[i][j]]++;
            }
        }
 
       

       for(int i=1;i<arr.length;i++){
        if(arr[i] == 2)rap = i;
        if(arr[i] == 0)missing = i;
       }
       int ans[] = new int[2];
       ans[0] = rap;
       ans[1] = missing;
       return ans;
    }
}