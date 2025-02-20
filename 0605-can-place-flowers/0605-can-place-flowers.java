class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int a = n;
        int m = flowerbed.length;
    boolean ans[]=new boolean[m];
    if(m == 1 &&flowerbed[0] == 0 && n == 1)return true;
    if(n == 0)return true;
    


    for(int i=0;i<m;i++){
        if(flowerbed[i] == 1) ans[i] = true;
        else ans[i] = false;
    }

    for(int i=0;i<m-1;i++){
        // if(i == m-1)
        if(ans[i] == true){
            continue;
        }else if(i == 0){
                if(ans[i+1] == false){
                    ans[i] = true;
                    a--;
                    if(a == 0)return true;
                }
            }else if(ans[i-1] == false && ans[i+1] == false ){
                ans[i] = true;
                a--;
                   if(a == 0)return true;
            }
        }

        if(a != 0 && m >1){
            if(ans[m-1] == false && ans[m-2] == false ){
                ans[m-1] = true;
                a--;
            }
        }
    
        if(a == 0 )return true;
        else return false;
    }
}