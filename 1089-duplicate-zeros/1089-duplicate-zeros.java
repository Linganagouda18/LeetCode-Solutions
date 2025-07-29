class Solution {
    public void duplicateZeros(int[] arr) {
        int[] res = new int[arr.length];
        int index = 0 ;
        for(int i = 0 ; i < arr.length && index < arr.length ;i++){
            if(arr[i] == 0){
                res[index++] = 0;
               if(index < arr.length){
                res[index++] = 0;
               }
            }else{
                  res[index++] = arr[i];
            }
    }
        for(int i = 0 ; i < arr.length;i++){
                arr[i] = res[i];
            }
}
}