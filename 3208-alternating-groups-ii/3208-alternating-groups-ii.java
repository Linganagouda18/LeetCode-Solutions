class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int i=0;
        int j=1;
        int n = colors.length;
        int count = 0;

        while(j<n+k-1){
            if(colors[j%n] == colors[(j-1)%n]){
                i=j;
                
            }else if(j-i+1 == k){
                count++;
                i++;
            }
            j++;
        }
return count;
        
    }
}