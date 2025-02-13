class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Double>pq = new PriorityQueue<>();
        int count = 0;

        for(int i=0;i<nums.length;i++){
            pq.add((double)nums[i]);
        }

        while(pq.size() >1){
        //    if(pq.size() == 1 && pq.peek() >=k)return count;
        if(pq.peek() >= k )return count;
           double a = pq.remove();
           double b = pq.remove();

           if(a >=k && b >=k)return count;

           
           double c = Math.min(a,b)*2 + Math.max(a,b);
       
           
           pq.add(c);
          count++;
        
        }
        return count;
    }
}