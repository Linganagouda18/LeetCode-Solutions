class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
       int ans[] = new int[n];
        Stack<Integer>s = new Stack<>();

        s.push(0);


        for(int i=1; i<n ; i++){
            while(!s.isEmpty() && temperatures[s.peek()] < temperatures[i]){
           int val = s.pop();
           ans[val] = i-val;
            }

            s.push(i);
        }

        return ans;
        
    }
}