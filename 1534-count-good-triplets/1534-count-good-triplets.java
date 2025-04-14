class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n = arr.length;
        int count = 0;


        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){

                if(Math.abs(arr[i] - arr[j]) <=a){
                for(int k=j+1;k<n;k++){
               
                 int y =arr[j] - arr[k] ;
                 int z = arr[i] - arr[k] ;

                 if( Math.abs(y) <= b && Math.abs(z) <=c){
                    count++;
                 }
                }
                }
            }
        }

        return count;
    }
}