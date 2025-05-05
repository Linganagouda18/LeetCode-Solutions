class Solution {
    public int arrangeCoins(int n) {
if(n == 1)return 1;
        for(int i=1;i<=n;i++){
            n -= i;
            if(n<= i)return i;
        }
        return -1;
    }
}