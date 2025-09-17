class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer>map = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            map.put(ch , map.getOrDefault(ch,0)+1);
        }

        List<Map.Entry<Character,Integer>> ans = new ArrayList<>(map.entrySet());
        // ans.sort((v1,v2) -> v2.getValue().compareTo(v1.getValue()));
         ans.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        StringBuilder sb =new StringBuilder();

        for(Map.Entry<Character,Integer> list : ans){
            for(int i=0;i<list.getValue();i++){
                sb.append(list.getKey());
            }
        }

        return sb.toString();
    }
}