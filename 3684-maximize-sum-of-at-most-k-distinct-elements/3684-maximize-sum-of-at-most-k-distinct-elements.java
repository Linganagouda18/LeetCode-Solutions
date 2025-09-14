class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        int n = nums.length;

        Arrays.sort(nums);
        Set<Integer>set = new HashSet<>();
        List<Integer>ans = new ArrayList<>();

        for(int i=n-1;i>=0;i--){
            if(!set.contains(nums[i]) && k>0){
                ans.add(nums[i]);
                k--;
            }
            set.add(nums[i]);
        }

        int a[] = new int[ans.size()];

        for(int i=0;i<ans.size();i++){
            a[i] = ans.get(i);
        }

        return a;
    }
}