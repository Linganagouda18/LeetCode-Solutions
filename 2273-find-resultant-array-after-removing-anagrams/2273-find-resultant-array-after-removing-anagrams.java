class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();
        
     
        String previous = "";

        for (String word : words) {
           
            if (!isAnagram(previous, word)) {
                ans.add(word);
            }
            previous = word;
        }
        
        return ans;
    }

    private boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

       
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);

        return Arrays.equals(s1, s2);
    }
}