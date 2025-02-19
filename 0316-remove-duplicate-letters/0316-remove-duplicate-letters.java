class Solution {
    public String removeDuplicateLetters(String s) {

        int mini = Integer.MAX_VALUE;
        Stack<Character>st = new Stack<>();
        String str1 = "";
        int idx = 0;
        String str = "";
        HashSet<Character>set = new HashSet<>();

        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            if(!set.contains(ch)){
                 st.push(ch);
            }

            set.add(ch);
        }

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int num = (int)ch;

            if( num < mini){
                mini = num;
                idx = i;
            }
        }

        for(int i=idx;i<s.length();i++){
            char ch = s.charAt(i);

            if(set.contains(ch)){
                str +=ch;
            }

            set.remove(ch);
        }

        if(set.size() > 0){

                 for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                str1+=s.charAt(i);
                set.remove(s.charAt(i));
            }
        }

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            str1+=ch;
        }

        return str1;
        }else  {

        return str;
        }


   

    }
}