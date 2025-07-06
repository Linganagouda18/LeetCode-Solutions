class FindSumPairs {

    private int[] arr1 , arr2;
    private Map<Integer,Integer> map ;

    public FindSumPairs(int[] nums1, int[] nums2) {
        arr1 = nums1;
        arr2 = nums2;

        map = new HashMap<>();

        for(int i : arr2){
            map.put(i , map.getOrDefault(i , 0) +1);
        }
    }
    
    public void add(int index, int val) {
        int oldval = arr2[index];
        map.put(oldval , map.get(oldval)-1);

        arr2[index] += val;
        int newval = arr2[index];
        map.put(newval , map.getOrDefault(newval ,0)+1);
    }
    
    public int count(int tot) {
        int total = 0;

        for(int num : arr1){
            int target = tot - num;
            total += map.getOrDefault(target , 0);
        }

        return total;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */