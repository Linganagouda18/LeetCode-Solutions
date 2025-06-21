class Solution {
    public int[] numberOfPairs(int[] nums) {
        int ans[] = new int[2];
        int n = nums.length;
        int count = 0;
        int reminder = 0;
        Map<Integer,Integer>map = new HashMap<>();

        for(int i=0;i <n; i++){
            map.put(nums[i] , map.getOrDefault(nums[i] , 0)+1);
        }

        for(Integer i :map.keySet()){
            if(map.get(i) % 2 == 0){
                int a = map.get(i) / 2;
                count +=a;
            }else{
                 int a = map.get(i) / 2;
                count +=a;
                reminder += map.get(i) % 2;
            }
        }
        ans[0] = count;
        ans[1] = reminder;
        return ans;
    }
}