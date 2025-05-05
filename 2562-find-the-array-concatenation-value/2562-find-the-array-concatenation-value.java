class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int i=0;
        int j = nums.length-1;
        long sum = 0;

        if(nums.length % 2 != 0){
            sum += nums[nums.length/2];
        }




        while(i<j){
            String first = String.valueOf(nums[i]);
            String second = String.valueOf(nums[j]);
            String total =first + second;

            sum +=  Long.parseLong(total);

           
            i++;
            j--;
        }


    
return sum;
        
    }
}