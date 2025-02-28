class Solution {
    public int findMaxLength(int[] nums) {
        int sum =0;
         HashMap<Integer,Integer>map = new HashMap<>();
        int maxi = 0;

        for(int i=0;i<nums.length;i++){
           if(nums[i] == 0){
            sum += -1;
           }else{
            sum += 1;
           }

            if(sum == 0){
                maxi = i +1;
            }else if(map.containsKey(sum)){
                maxi = Math.max(maxi,i-map.get(sum));
            }else{
                map.put(sum , i);
            }
            
        }
        
           return  maxi;
    
    }
}