class Solution {
    public int[] replaceElements(int[] arr) {
        int ans[] = new int[arr.length];
        int n = arr.length;
        ans[n-1] = -1;
        int maxi = 0;

        for(int i=n-2;i>=0;i--){
             maxi = Math.max(maxi , arr[i+1]);
             ans[i] = maxi;
        }
        return ans;
    }
}