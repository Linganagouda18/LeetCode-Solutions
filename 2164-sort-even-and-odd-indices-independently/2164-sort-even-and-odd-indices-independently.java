class Solution {
    public int[] sortEvenOdd(int[] nums) {
        List<Integer>list = new ArrayList<>();
        List<Integer>list1 = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(i % 2 == 0){
                list.add(nums[i]);
            }else{
                list1.add(nums[i]);
            }
        }

        Collections.sort(list);
        Collections.sort(list1);

        // int ans[] = new int[nums.length];
        int a = 0;
        // int b = nums.length-1;
        int b = list1.size()-1;

        for(int i=0;i<nums.length;i++){
            if(i % 2 == 0){
              nums[i] =  list.get(a);
              a++;
            }else{
                nums[i] = list1.get(b);
                b--;
            }
        }
return nums;
    }
}