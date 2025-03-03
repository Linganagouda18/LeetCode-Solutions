class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer>ans = new ArrayList<>();
        List<Integer>ans1 = new ArrayList<>();
        int a = 0;
        int count=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == pivot)count++;
            if(nums[i] < pivot){
                ans.add(nums[i]);
            }else if (nums[i] > pivot){
                ans1.add(nums[i]);
            }
        }

        while(count > 0){
            ans.add(pivot);
            count--;
        }



        int ans2[] = new int[nums.length];

        for(int i=0;i<ans.size();i++){
            ans2[a++] = ans.get(i);
        }

        for(int i=0;i<ans1.size();i++){
            ans2[a++] = ans1.get(i);
        }
        return ans2;
    }
}