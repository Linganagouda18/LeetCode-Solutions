// class Solution {
//     public int[] successfulPairs(int[] spells, int[] potions, long success) {
//         int n = spells.length;
//         int m = potions.length;
//         int ans[] = new int[n];

//         Arrays.sort(potions);

//         for(int i=0;i<n;i++){
//             // int count = 0;
//             for(int j=0;j<m;j++){

              
//             if((long)spells[i] * potions[j] >= success){
                    
//                      ans[i] = m-j;
//                     break;
//                 }
//             }

//            if(ans[i] == 0)  ans[i] = 0;
//         }

//         return ans;
//     }
// }
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int n = spells.length;
        int ans[] = new int[n];

        for (int i = 0; i < n; i++) {
            int idx = bs(potions, spells[i], success);
            if (idx != -1) ans[i] = potions.length - idx;
        }

        return ans;
    }

    int bs(int potions[], long strength, long success) {
        int low = 0, high = potions.length - 1, idx = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ((long) potions[mid] * strength >= success) {
                idx = mid;
                high = mid - 1; // find smaller index
            } else {
                low = mid + 1;
            }
        }
        return idx;
    }
}