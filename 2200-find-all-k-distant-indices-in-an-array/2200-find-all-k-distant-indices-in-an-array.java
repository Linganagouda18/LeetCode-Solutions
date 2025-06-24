class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer>ans = new ArrayList<>();
        int n = nums.length;
        HashSet<Integer>set = new HashSet<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i] == key){
                for(int j=0;j<n;j++){
                    if(!set.contains(j)){
                        int a = Math.abs(j-i);
                        if(a <= k){
                            set.add(j);
                            ans.add(j);
                        }
                    }
                }
            }
        }
         Collections.sort(ans);
         return ans;
    }
}