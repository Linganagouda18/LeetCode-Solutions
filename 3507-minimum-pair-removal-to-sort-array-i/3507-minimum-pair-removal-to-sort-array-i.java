class Solution {
    public int minimumPairRemoval(int[] nums) {
        ArrayList<Integer>ans = new ArrayList<>();
        int count = 0;

        for(int i=0;i<nums.length;i++){
            ans.add(nums[i]);
        }

        while(!notdecreasing(ans)){
            int start =0;
        int maxi = Integer.MAX_VALUE;

            for(int i=0;i<ans.size()-1;i++){
                int sum =ans.get(i) + ans.get(i+1);

                if(maxi > sum){
                    maxi = sum;
                    start = i;
                }
            }

          ans.set(start ,  ans.get(start)+ans.get(start+1));
           ans.remove(start+1);
           count++;

        }   


        
        return count;
    }
     public boolean notdecreasing(ArrayList<Integer>ans)  {
            for(int i=1;i<ans.size();i++){
                if(ans.get(i) < ans.get(i-1))return false;
            }
            return true;
        }   
}