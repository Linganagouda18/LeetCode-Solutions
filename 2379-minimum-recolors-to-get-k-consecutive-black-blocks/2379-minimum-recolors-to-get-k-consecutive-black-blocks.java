class Solution {
    public int minimumRecolors(String blocks, int k) {

        int mini = Integer.MAX_VALUE;
        int i=0;
        int n = blocks.length();
        int count = 0;

        for(int j=0;j<n;j++){
            char ch = blocks.charAt(j);
            char ch1 = blocks.charAt(i);
            // map.put(ch1,map.getOrDefault(ch,0)+1);

            if(ch == 'W')count++;

            if(j-i+1 == k){
                mini = Math.min(count,mini);

                if(ch1 == 'W'){
                    count--;
                }
                    i++;
            }
        }

        return mini;
    }
}
        // HashMap<Character,Integer>map = new HashMap<>();
        // int i=0;
        // int j=0;
        // int n = blocks.length();
        // int mini =Integer.MAX_VALUE;
        // if(n == 1 && blocks.charAt(0) == 'W')return 1;
        

        // while(j<n){
        //     char ch = blocks.charAt(j);
        //     char ch1 = blocks.charAt(i);
        //     map.put(ch,map.getOrDefault(ch,0)+1);

        //     if(j-i+1 == k && map.size() ==2 ){
        //            mini = Math.min(mini,map.get('W'));
        //     }
        //     while(j-i+1>k && map.containsKey('W')){
        //         map.put(ch1,map.get(ch1)-1);
        //         mini = Math.min(mini,map.get('W'));
        //         if(map.get(ch1) == 0) map.remove(ch1);
        //         i++;
        //     }
        //     j++;
        // }

        // if(mini == Integer.MAX_VALUE)return 0;
        // return mini;
    