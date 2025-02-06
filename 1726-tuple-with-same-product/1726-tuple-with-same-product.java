class Solution {
    public int tupleSameProduct(int[] nums) {
        int count = 0;
        // HashSet<Integer>set = new HashSet<>();
        HashMap<Integer,Integer>set = new HashMap<>();

        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
               int sum =  nums[i] * nums[j];
                if(set.containsKey(sum)){
                    count += (set.get(sum) *8);
                }

                set.put(sum,set.getOrDefault(sum,0)+1);
            }
        }
        return count;
    }
}