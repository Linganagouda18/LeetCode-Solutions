class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        int m = baskets.length;
        if(n == 1 && m == 1){
            if(fruits[0] <= baskets[0]){
                return 0;
            }else if (fruits[0] > baskets[0]){
                return 1;
            }
        }
        
        int count = 0;


        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(fruits[i] <= baskets[j] && baskets[j] != -1){
                    count++;
                    baskets[j] = -1 ;
                    break;
                }
            }
        }
        return m-count;
    }
}