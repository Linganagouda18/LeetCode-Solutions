class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int count = 0;
        int maxi = Integer.MIN_VALUE;

        for(int i : nums){
            map.put(i , map.getOrDefault(i,0)+1);
        }

        for(int i : map.keySet()){
            maxi = Math.max(map.get(i),maxi);
        }

        for(int i:map.keySet()){
            if(maxi == map.get(i)) {
                count += map.get(i);
            }
        }

        return count;
    }
}