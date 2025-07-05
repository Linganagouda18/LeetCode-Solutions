class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int maxi = 0;

        for(int i=0;i<arr.length;i++){
            map.put(arr[i] , map.getOrDefault(arr[i] , 0)+1);
        }

        for(Integer i :map.keySet()){

            if(map.get(i) == i){
                maxi = Math.max(maxi , i);
            }
        };

        if(maxi == 0)return -1;
        else return maxi;
    }
}