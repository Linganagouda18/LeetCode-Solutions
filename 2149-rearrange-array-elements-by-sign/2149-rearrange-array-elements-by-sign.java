class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer>ans = new ArrayList<>(); //positive
        ArrayList<Integer>ans1 = new ArrayList<>(); //negative
        int an[] = new int[nums.length];
        int a = 0;
        int b = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] > 0)ans.add(nums[i]);
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i] < 0)ans1.add(nums[i]);
        }
        
        for(int i=0;i<nums.length;i++){
            if(i % 2 == 0){
            an[i] = ans.get(a);
            a++;

           } else{
            an[i] = ans1.get(b);
            b++;
            }
        }

        return an;
    }
}