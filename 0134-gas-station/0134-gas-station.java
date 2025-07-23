class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int g = 0; 
        int c = 0;


        for(int i=0;i<gas.length;i++){
            g += gas[i];
            c += cost[i];
        }

        if(g < c) return -1;
        int j = 0 , sum = 0;
      
      for(int i=0;i<gas.length;i++){
         sum = gas[i] - cost[i];

        if(sum < 0 ){
            sum = 0;
            j = i+1;
        }
      }
        return j;
    }
}