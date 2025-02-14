class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Integer>pq = new PriorityQueue<>();

        for(int i=0;i<nums.length;i++){
           pq.add(nums[i]);
        }
        int count = 0;
        
        while(!pq.isEmpty()){
            if(pq.remove() < k){
                count++;
                // pq.remove();
            }
        }

        return count;
    }
}