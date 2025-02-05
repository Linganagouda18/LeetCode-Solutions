class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        HashSet<Character>set1 = new HashSet<>();
        HashSet<Character>set2 = new HashSet<>();



    
    int count = 0;

    for(int i=0;i<s1.length();i++){
        char ch = s1.charAt(i);
        char ch1 = s2.charAt(i);

        // if(ch == ch1)set1.remove(ch);

       if(ch != ch1){
            count++;
         set1.add(ch);
    set2.add(ch1);
        }
    }

    if(!set1.equals(set2))return false;

   if(count > 2)return false;

   if(count == 0 || set1.equals(set2) || count ==2)return true;
   else return false;
    }
}