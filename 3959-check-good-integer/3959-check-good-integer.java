class Solution {
    public boolean checkGoodInteger(int n) {
        int sum = 0;
        int sum1 = 0;


        while(n >0){
            int rem = n %10;
            sum += rem;
            sum1 += rem * rem;

            n/=10;
        }
    return (sum1-sum) >= 50;
    }

}