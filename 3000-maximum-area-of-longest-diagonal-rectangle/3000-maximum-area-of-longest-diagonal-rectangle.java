class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {

        int maxi  = 0;
        int res = 0;
        for(int i=0;i<dimensions.length;i++){
            int zero = dimensions[i][0];
            int one = dimensions[i][1];
            

            int rectangle = zero * zero + one * one;

            if(maxi < rectangle || (rectangle == maxi && zero * one > res)){
                maxi = rectangle;
                 res = one * zero;
            }
        }
        return res;
    }
}