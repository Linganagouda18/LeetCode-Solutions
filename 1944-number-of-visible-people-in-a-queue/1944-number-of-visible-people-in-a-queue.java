class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n  = heights.length;
        Stack<Integer>s = new Stack<>();
        int ans[] = new int[n];
        ans[n-1] = 0;
        // ans[n-2] = 1;
        s.push(heights[n-1]);
        // s.push(heights[n-2]);


        for(int i=n-2; i>=0; i--){
            int count = 0;
            while(!s.isEmpty() && heights[i] > s.peek()){
             s.pop();
                
                count++;
               
            
            }

          
         if(!s.isEmpty()){
            count++;
         }

         ans[i] = count;
    
            s.push(heights[i]);
        }

        return ans;
    }
}