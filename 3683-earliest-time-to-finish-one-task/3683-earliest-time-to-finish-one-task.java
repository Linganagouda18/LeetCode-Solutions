class Solution {
    public int earliestTime(int[][] tasks) {
        int n = tasks.length;
        int maxi = Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            maxi = Math.min(maxi , tasks[i][0]+tasks[i][1]);
        }

        return maxi;
    }
}