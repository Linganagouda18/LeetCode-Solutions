// class Solution {
//     public String removeOccurrences(String s, String part) {
//         Stack<Character>st = new Stack<>();
//         int n = part.length()-1;
//         char ch1 = part.charAt(n);
//         StringBuilder sb = new StringBuilder();

//         for(int i=0;i<s.length();i++){
//             char ch = s.charAt(i);
//             if(ch == ch1){
//                 if(st.size() > n){
//                 for(int j=n-1;j>=0;j--){
//                     char c = part.charAt(j);
                    
                    
//                     if( c == st.peek()){
//                         st.pop();
//                     }else{
//                         break;
//                     }
                    
//                 }
//             }else{
//                 st.push(ch);
//             }
//         }

//         while(!st.isEmpty()){
//             sb.append(st.pop());
//         }

//         return sb.reverse().toString();
//     }
// }
class Solution {
    public String removeOccurrences(String s, String part) {
        Stack<Character> st = new Stack<>();
        int n = part.length();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            st.push(ch);
            
            // Check if the current stack matches the 'part' string
            if (st.size() >= n && isPartMatch(st, part)) {
                // Pop the elements matching 'part'
                for (int j = 0; j < n; j++) {
                    st.pop();
                }
            }
        }

        // Rebuild the resulting string from the stack
        while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }

    private boolean isPartMatch(Stack<Character> st, String part) {
        int partIndex = part.length() - 1;
        // Check if the stack's last 'n' elements match the 'part' string
        for (int i = st.size() - 1; i >= st.size() - part.length(); i--) {
            if (st.get(i) != part.charAt(partIndex--)) {
                return false;
            }
        }
        return true;
    }
}
