class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddsum = n *n;
        int evensum = n*(n+1);
        int maxi = Math.max(oddsum , evensum);

        for(int i=maxi;i>=1;i--){
            if(oddsum % i == 0 && evensum % i == 0) return i;
        }

        return -1;
    }
}