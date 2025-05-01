class Solution {
    public int hIndex(int[] citations) {
    //     int maxi = 0;
    //     Arrays.sort(citations);
    //     int n = citations.length;

    //   if(n == 1 && citations[0] == 0)return 0;

    //     for(int i=0;i<citations.length;i++){
    //     if(citations[i] == 0)continue;
    //         if(citations[i] >= n-i){
    //         maxi = citations[i];
    //         }else{
    //             break;
    //         }
    //     }
    //     return maxi;


     int maxi = 0;
        Arrays.sort(citations);
        int n = citations.length;

      if(n == 1 && citations[0] == 0)return 0;

        for(int i=0;i<citations.length;i++){
        if(citations[i] == 0)continue;
            if(citations[i] >= n-i){
            return n-i;
            }
        }
        return 0;
    }
}