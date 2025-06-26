class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String , List<String>>ans = new HashMap<>();

         for(int i=0;i<strs.length;i++){
            char[] s = strs[i].toCharArray();
            Arrays.sort(s);

            String res = new String(s);
            if(!ans.containsKey(res)){
                ans.put(res, new ArrayList<>());
            }

            ans.get(res).add(strs[i]);
        
    }

    return new ArrayList<>(ans.values());
}
}