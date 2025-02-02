class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;

        for(int i=0;i<n;i++){
            if(nums[i] > nums[(i+1)%n])count++;

            if(count >1)return false;
        }



        // HashSet<Integer>set = new HashSet<>();
        // // int b = nums[0];
        // int count = 0;

        // for(int i=1;i<n;i++){
        //     int b = nums[i];
        //     if(b > nums[i])count++;
        //     if(count >3)return false;
        // }

        // for(int i=0;i<n;i++){
        //     int a = nums[i];
        //         // if(set.contains(nums[i]))continue;
        //     for(int j=i+1;j<n-1;j++){
        //         if(nums[i] > nums[j]){
        //             // if(set.contains(nums[j+1]))return false;
        //             if(nums[j+1] > a)return false;
        //         }
        //         // set.add(nums[j]);
        //     }
        // }

        return true;
    }
}