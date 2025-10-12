class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int count = 0;
        Map<Integer,Integer>map = new HashMap<>();


        for(int i : nums) map.put(i,map.getOrDefault(i,0)+1);

        for(int i:map.keySet()){
            if(map.get(i) %k == 0){
                count += (map.get(i) * i);
            }
        }
        return count;
    }
}