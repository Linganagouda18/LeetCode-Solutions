class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        int n = arr.length;
        int m = target.length;
        if(n != m)return false;
        // HashMap<Integer,Integer>map= new HashMap<>();
        // HashMap<Integer,Integer>map1= new HashMap<>();
        

        // for(int i=0;i<arr.length;i++){
        //     map.put(arr[i] , map.getOrDefault(arr[i] , 0)+1);
        //     map1.put(target[i] , map.getOrDefault(target[i] , 0)+1);
        // }

       Arrays.sort(arr);
       Arrays.sort(target);

       for(int i=0;i<n;i++){
        if(arr[i] != target[i])return false;
       }
        return true;
    }
}