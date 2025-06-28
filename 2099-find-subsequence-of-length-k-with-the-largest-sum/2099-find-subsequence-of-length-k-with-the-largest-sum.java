import java.util.*;

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;

        // Step 1: Create an array of (value, index) pairs
        int[][] pair = new int[n][2];
        for (int i = 0; i < n; i++) {
            pair[i][0] = nums[i]; // value
            pair[i][1] = i;       // original index
        }

        // Step 2: Sort the array based on value in descending order
        Arrays.sort(pair, (a, b) -> b[0] - a[0]);

        // Step 3: Select top k elements
        List<int[]> selected = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            selected.add(pair[i]);
        }

        // Step 4: Sort the selected elements by their original indices
        selected.sort((a, b) -> a[1] - b[1]);

        // Step 5: Extract the values into the result array
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = selected.get(i)[0];
        }

        return result;
    }
}
