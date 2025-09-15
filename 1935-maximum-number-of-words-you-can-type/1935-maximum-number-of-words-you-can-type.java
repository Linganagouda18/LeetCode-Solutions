class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character>set  = new HashSet<>();
      int n =   brokenLetters.length();
      int res = 0;
        for(int i=0;i<n;i++){
            char ch = brokenLetters.charAt(i);
            set.add(ch);
        }

          String[] words = text.split(" ");
        for(int i=0;i<words.length;i++){
            char[] arr = words[i].toCharArray();
            int count = 0;

            for(int j=0;j<arr.length;j++){
                if(set.contains(arr[j])) count++;
            }
            if(count == 0) res++;
        }
        return res;
    }
}