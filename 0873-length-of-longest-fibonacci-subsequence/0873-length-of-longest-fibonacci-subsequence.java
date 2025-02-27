class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int maxi = 0;

        for(int i=0;i<arr.length;i++){
            map.put(arr[i] , i);
        }


        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int prev = arr[j];
                int prevv = arr[i];
                int count = 2;

                while(map.containsKey(prev + prevv)){
                    count++;
                   maxi =  Math.max(maxi,count);

                    int temp = prev;
                    prev = prev+prevv;
                    prevv = temp;

                }
            }
        }

        return maxi > 2 ? maxi : 0;
    }
}
        // int i = 0;
        // int j = 1;
        // int count = 2;
        // int maxi = 0;
        // HashMap<Integer,Integer>map = new HashMap<>();
        
        // for(int a=0;a<arr.length;a++){
        //     map.put(arr[a] ,a);
        // }

        // while(i < arr.length){
        //     int n = 0;

        //     while(j<arr.length){

        //         if(map.containsKey(arr[i] + arr[j])){
        //             int sum = map.get(arr[i]+arr[j]);
        //             i = j;
        //             j=map.get(sum);
        //             n++;
        //             count++;
        //             maxi = Math.max(maxi,count);
        //             break;
        //         }

        //         if(n > 0){
        //             break;
        //         }else{
        //             j++;
        //         }
        //     }

        //     if(n >0){}
        //     else i++;
        // }

        // return maxi;
        
//     }
// }