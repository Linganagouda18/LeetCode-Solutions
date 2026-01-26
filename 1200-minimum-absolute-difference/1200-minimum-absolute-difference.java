class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            min = Math.min(arr[i+1]-arr[i] , min);
        }

        for(int i=0;i<arr.length-1;i++){
        List<Integer>ans = new ArrayList<>();
            if(arr[i+1] - arr[i] == min){
                 ans.add(arr[i]);
                 ans.add(arr[i+1]);
        }
        if(ans.size() >1) res.add(ans);
        }

        return res;
    }
}