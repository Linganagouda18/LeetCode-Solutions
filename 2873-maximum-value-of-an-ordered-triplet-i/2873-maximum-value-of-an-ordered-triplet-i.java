class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxi = 0;

        if (nums.length < 3) {
            return 0;
        }

        if (nums.length == 3) {
            long out = (long) (nums[0] - nums[1]) * nums[2];
            return out < 0 ? 0 : out;
        }

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                for (int k = j + 1; k < nums.length; k++) {
                    
                    long sum = (long) (nums[i] - nums[j]) * nums[k];
                    if (sum > maxi) {
                        maxi = sum;
                    }
                }
            }
        }

        return maxi;
    }
}
