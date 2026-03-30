class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char ch[] = s1.toCharArray();
        char ch1[] = s2.toCharArray();

        int n = ch.length;
        // int m = ch1.lenght;


     for(int i=0;i<n-2;i++){
        if(ch[i] == ch1[i]){
            continue;
        }else{
            //swap 
            char temp = ch[i];
            ch[i] = ch[i+2];
            ch[i+2] = temp;
        }
     }

     for(int i=0;i<n;i++){
        if(ch[i] != ch1[i])return false;
     }

     return true;
    }
}