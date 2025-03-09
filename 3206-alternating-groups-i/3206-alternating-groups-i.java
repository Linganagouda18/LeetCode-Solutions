class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int count = 0;
        for(int i=0;i<colors.length;i++){
            if(i == colors.length-2){
                if(colors[i] != colors[i+1] && colors[i+1] != colors[0]){
                    count++;
                }
            }else if(i == colors.length-1){
                if(colors[i] != colors[0] && colors[0] != colors[1]){
                    count++;
                }
            }else{
                if(colors[i] != colors[i+1] && colors[i+1] != colors[i+2]){
                    count++;
                }
            }
        }

        return count;
        
    }
}