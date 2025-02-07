class Solution {
    public int removeDuplicates(int[] nums) {
         LinkedHashMap<Integer,Integer> map= new LinkedHashMap<>();
        // int ans[] = new int[nums.length];
        int a = 0;
        // ArrayList<Integer>arr = new ArrayList<>();
        int count = 0;

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],Math.min(map.getOrDefault(nums[i],0)+1 ,2));
        }

            for(int i :map.keySet()){
                if(map.get(i) == 2){
                    nums[a] = i;
                    nums[a+1] =i;
                    a++;
                }else{
                    nums[a] = i;
                }
                    a++;
            }

            return a;
    }
}