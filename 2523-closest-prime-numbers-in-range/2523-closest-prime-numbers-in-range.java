class Solution {
    public int[] closestPrimes(int left, int right) {
        int ans1[] = new int[2];
        ArrayList<Integer>ans = new ArrayList<>();
        ArrayList<Integer>ans2 =new ArrayList<>();
        Arrays.fill(ans1,-1);
        int mini = Integer.MAX_VALUE;

        for(int i=left;i<=right;i++){
            if(isPrime(i)){
                ans.add(i);
            }
        }

        for(int i=0;i<ans.size()-1;i++){
          if(mini > ans.get(i+1)-ans.get(i) && mini !=ans.get(i+1)-ans.get(i)){
            ans2 = new ArrayList<>();
            ans2.add(ans.get(i));
            ans2.add(ans.get(i+1));

            mini = ans.get(i+1)-ans.get(i);
          }
        }

       for(int i=0;i<ans2.size();i++){
        ans1[i] = ans2.get(i);
       }

        return ans1;
        
    }

      public static boolean isPrime(int num) {
        // Prime numbers are greater than 1
        if (num <= 1) {
            return false;
        }

        // Check divisibility from 2 to the square root of num
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}