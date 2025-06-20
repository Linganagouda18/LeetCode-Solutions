class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int ans[] = new int[k];
        int a = 0;
        HashMap<Integer,Integer>map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0)+1);
        }

        List<Map.Entry<Integer,Integer>>entryset = new ArrayList<>(map.entrySet());
       entryset.sort(Map.Entry.<Integer, Integer>comparingByValue().reversed());

        LinkedHashMap<Integer,Integer>sortedmap = new LinkedHashMap<>();
         for (Map.Entry<Integer, Integer> entry : entryset) {
            sortedmap.put(entry.getKey(), entry.getValue());
        }

        for (Map.Entry<Integer, Integer> entry : sortedmap.entrySet()) {
           if(a < k){
             ans[a] = entry.getKey();
            a++;
           }
}
return ans;
        
    }
}