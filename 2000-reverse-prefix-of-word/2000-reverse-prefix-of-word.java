class Solution {
    public String reversePrefix(String word, char ch) {
        Stack<Character>s = new Stack<>();

        int i;
        String str = "";
        int count = 0;

        for(i=0;i<word.length();i++){
            char ch1 = word.charAt(i);

            if(ch == ch1){
                str += ch1;
                count++;
                break;
            }

           s.push(ch1);
        }

if(count == 0){
    return word;
}
        while(!s.isEmpty()){
            str +=s.pop();
        }

        for(int j=i+1;j<word.length();j++){
            str += word.charAt(j);
        }

        return str;
    }
}