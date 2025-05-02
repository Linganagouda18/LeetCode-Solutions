class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        ArrayList<Integer>ans = new ArrayList<>();

        HashMap<Integer,Integer>set = new HashMap<>();

        for(int i=0;i<m;i++){
             set.put(nums2[i],set.getOrDefault(nums2[i] , 0)+1);
        }

        for(int i=0;i<n;i++){
            if(set.containsKey(nums1[i])){
              ans.add(nums1[i]);
                set.put(nums1[i] , set.get(nums1[i])-1);

                if(set.get(nums1[i]) == 0)set.remove(nums1[i]);
              
            }
        }

        int ans1[] = new int[ans.size()];

        for(int i=0;i<ans.size();i++){
            ans1[i] = ans.get(i);
        }
        return ans1;
    }
}