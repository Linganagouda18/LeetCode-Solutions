class Solution {
    public long sumAndMultiply(int n) {
        
            int count = 1;
            long sum = 0;

        while(n > 0){
            int rem = n %10;
            if(rem != 0){
            sum += count * rem;
            count *= 10;
            }
            n /= 10;
        }

        long val = sum;
        long sum1 = 0;
        while(val >0){
            sum1 += val % 10;
            val /=10;
        }
        return sum * sum1;
    }
}