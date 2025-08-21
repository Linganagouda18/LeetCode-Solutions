class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int count = 0;
        Set<Integer>set = new HashSet<>();
        for(int i=0;i<arr.length-1;i++){
            if(!set.contains(arr[i+1] - arr[i]) && !set.isEmpty()) return false;

            if(i == 0){
                set.add(arr[i+1] - arr[i]);
            }
        }
        return true;
    }
}