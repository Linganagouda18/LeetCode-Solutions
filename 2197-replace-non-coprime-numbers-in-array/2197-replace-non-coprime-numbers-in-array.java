// class Solution {
//     public List<Integer> replaceNonCoprimes(int[] nums) {
//         List<Integer>ans = new ArrayList<>();
//         List<Integer>res = new ArrayList<>();

//         for(int i=nums.length-1;i>=0;i--){
//             ans.add(nums[i]);
//         }

//         while(ans.size() >1){
//             int a = ans.remove(ans.size()-1);
//             int b = ans.get(ans.size()-2);

//             int c = gcd(a,b);

//             if(c == 1) {
//                 // res.add(ans.remove(ans.size()-1));
//                 break;
//             }else{
//                 int l = lcm(a,b);
//                 ans.add(l);
//             }
//         }

//         return res;
//     }

//    private int gcd(int a, int b) {
//         return (b == 0) ? a : gcd(b, a % b);
//     }
//      private int lcm(int a, int b) {
//         return a / gcd(a, b) * b;
//     }
// }

class Solution {
    private int gcd(int a , int b){
        if(b == 0) return a;
        return gcd(b,a % b);
    }
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer>ans = new ArrayList<>();

        for(int num : nums){
            ans.add(num);
            while(ans.size() > 1){
                int a = ans.get(ans.size()-1);
                int b = ans.get(ans.size()-2);

                int c = gcd(a,b);

                if(c == 1) break;

                long lcm = (long) a * b /c;
                ans.remove(ans.size()-1);
                ans.set(ans.size()-1 , (int)lcm);
            }
        }

        return ans;
    }
}