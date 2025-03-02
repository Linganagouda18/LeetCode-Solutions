class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]>ans=new ArrayList<>();

     int i=0;
     int j=0;
     int n = nums1.length;
     int m = nums2.length;

     while(i<n && j < m){
        if(nums1[i][0] == nums2[j][0]){
            // ans.add(nums1[i]);
            nums1[i][1] = nums1[i][1] +nums2[j][1];
            ans.add(nums1[i]);
            i++;
            j++;
        }else if(nums1[i][0] < nums2[j][0]){
            ans.add(nums1[i]);
            i++;
        }else{
            ans.add(nums2[j]);
            j++;
        }
     }

     while(i<n){
        ans.add(nums1[i]);
        i++;
     }

     while(j<m){
        ans.add(nums2[j]);
        j++;
     }
       return ans.toArray(new int[ans.size()][]);
    }
}