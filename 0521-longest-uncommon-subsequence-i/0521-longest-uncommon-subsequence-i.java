class Solution {
    public int findLUSlength(String a, String b) {
        // HashMap<Character,Integer>map =  new HashMap<>();
        // HashMap<Character,Integer>map1 =  new HashMap<>();



        // for(int i=0;i<a.length();i++){
        //     char ch = a.charAt(i);

        //     map.put(ch , map.getOrDefault(ch,0)+1);
        // }


        // for(int i=0;i<b.length();i++){
        //     char ch = b.charAt(i);

        //      map1.put(ch , map1.getOrDefault(ch,0)+1);
        // }


        // if(map.equals(map1))return -1;
        // else return Math.max(a.length(),b.length());

        if(a.equals(b)) return -1;
        else return Math.max(a.length() ,  b.length());
    }
}