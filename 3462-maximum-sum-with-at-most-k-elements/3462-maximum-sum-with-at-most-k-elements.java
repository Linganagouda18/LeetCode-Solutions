class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        HashMap<Integer,Integer>set = new HashMap<>();
PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int sum = 0;

        for(int i=0;i<limits.length;i++){
            set.put(limits[i], set.getOrDefault(limits[i],0)+1);
        }

        for(int i=0;i<grid.length;i++){
            Arrays.sort(grid[i]);
            for(int j=0;j<limits[i];j++){
                 pq.add(grid[i][grid[0].length-1-j]);

                // if(set.containsKey(grid[i][0])){
                //     set.put(grid[i][j] , set.get(grid[i][j])-1);
                //     if((set.get(grid[i][j]) == 0)) set.remove(grid[i][j]);
                // }else{
                //     pq.add(grid[i][j]);
                // }
            }
        }

        while(k>0){
            sum += pq.remove();
            k--;
        }
        return sum;
    }
}