class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length-1;
        List<Integer>ans= new ArrayList<>();

        int i=0;
        int j = nums.length-1;

        while(i<=j){
            ans.add(nums[i]+nums[j]);
            i++;
            j--;
        }

        Collections.sort(ans);
        return ans.get(ans.size()-1);
    }
}