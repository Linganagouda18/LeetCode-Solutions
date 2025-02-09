class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer>ans = new ArrayList<>();
        
        HashSet<Integer>set = new HashSet<>();

        for(int i=0;i<nums2.length;i++){
            set.add(nums2[i]);
        }

        for(int i=0;i<nums1.length;i++){
            if(set.contains(nums1[i])){
                ans.add(nums1[i]);
                set.remove(nums1[i]);
                
            }
        }

        int ans1[] = new int[ans.size()];

        for(int i=0;i<ans.size();i++){
            ans1[i] = ans.get(i);
        }

        return ans1;
    }
}