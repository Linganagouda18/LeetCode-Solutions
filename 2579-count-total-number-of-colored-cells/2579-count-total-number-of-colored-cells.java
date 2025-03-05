class Solution {
    public long coloredCells(int n) {
        long sum = 1;
        if(n == 1 )return 1;

        for(int i=1;i<n;i++){
            sum = i *4+1;
        }
        return sum;
    }
}