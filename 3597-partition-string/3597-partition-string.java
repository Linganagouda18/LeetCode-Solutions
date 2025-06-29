class Solution {
    public List<String> partitionString(String s) {
        List<String>ans = new ArrayList<>();
        HashSet<String>set = new HashSet<>();

        int j=0;

        while(j < s.length()){
            char ch = s.charAt(j);

            if(!set.contains(Character.toString(ch))){
                ans.add(Character.toString(ch));
                set.add(Character.toString(ch));
                j++;
            }else{
                String str = Character.toString(ch);
                while(set.contains(str) && j+1<s.length()){
                    j++;
                    str += Character.toString(s.charAt(j));
                }

               if(!set.contains(str)) ans.add(str);
                set.add(str);
                j++;
            }
        }
        return ans;
    }
}