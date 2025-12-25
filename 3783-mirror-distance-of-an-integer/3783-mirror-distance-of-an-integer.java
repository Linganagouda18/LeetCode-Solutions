class Solution {
    public int mirrorDistance(int n) {
        int first = n ;
        String a = String.valueOf(n);
        StringBuilder sb = new StringBuilder(a);
        
        int second = Integer.parseInt(sb.reverse().toString());

        

       
        return Math.abs(first - second);
    }
}