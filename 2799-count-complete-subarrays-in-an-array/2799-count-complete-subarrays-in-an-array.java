class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        HashSet<Integer>set = new HashSet<>();
        HashMap<Integer,Integer>map = new HashMap<>();
        int count = 0;


        for(int i : nums){
            set.add(i);
        }
        int i =0;
        int j=0;
int k = set.size();
        while(j<n){
            map.put(nums[j] , map.getOrDefault(nums[j],0)+1);

            
                while(map.size() == k){
                    count += n-j;
map.put(nums[i], map.get(nums[i]) - 1);

if (map.get(nums[i]) == 0) {
    map.remove(nums[i]);
}

                
            }
            j++;
        }
        return count;
    }
}