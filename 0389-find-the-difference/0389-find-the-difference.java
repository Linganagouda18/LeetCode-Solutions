class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer>set = new HashMap<>();

        for(int i=0;i<s.length();i++){
           set.put(s.charAt(i),set.getOrDefault(s.charAt(i),0)+1);
        }

        for(int i=0;i<t.length();i++){
            if(!set.containsKey(t.charAt(i))){
                return t.charAt(i);
            }else{
             set.put(t.charAt(i), set.getOrDefault(t.charAt(i), 0) - 1);

if (set.get(t.charAt(i)) == 0) {
    set.remove(t.charAt(i));
}

            }
        }
        return ' ';
    }
}