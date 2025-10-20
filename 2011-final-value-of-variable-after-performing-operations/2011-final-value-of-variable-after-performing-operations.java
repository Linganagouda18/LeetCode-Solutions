class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int c = 0;
        // int negative = 0;
        // int positive = 0;

        for(int i=0;i<operations.length;i++){
            if(operations[i].contains("-")){
               negative++;
            }else{
              positive++;
            }
        }

        return Math.abs(negative - positive);
    }
}