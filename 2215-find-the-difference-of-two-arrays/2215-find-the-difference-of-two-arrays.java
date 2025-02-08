class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer>set = new HashSet<>();
        HashSet<Integer>set1 = new HashSet<>();

        LinkedList<Integer>list = new LinkedList<>();
        LinkedList<Integer>list1 = new LinkedList<>();
        List<List<Integer>>l1 = new LinkedList<>();



        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }

        for(int i=0;i<nums2.length;i++){
            set1.add(nums2[i]);
        }

        for(int i=0;i<nums1.length;i++){
            if(!set1.contains(nums1[i])){
                list.add(nums1[i]);
                set1.add(nums1[i]);
            }
        }

        for(int i=0;i<nums2.length;i++){
            if(!set.contains(nums2[i])){
                list1.add(nums2[i]);
                set.add(nums2[i]);
            }
        }
        l1.add(list);
        l1.add(list1);
        return l1;
    }
}