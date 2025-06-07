// class Solution {
//     public String clearStars(String s) {
//         List<Character>ans = new ArrayList<>();
//         StringBuilder sb = new StringBuilder();

//         for(int i=0;i<s.length();i++){
//             char ch = s.charAt(i);


//                 int min = -1;
//             if(ch == '*'){

//                 for(int j=0;j<ans.size();j++){
//                     if(min == -1 || ans.get(j) <=ans.get(min)){
//                         min = j;
//                     }
//                 }

//             }else{
//                 ans.add(ch);
//             }
//                 if(min != -1){
//                     ans.remove(min);
//                 }
//         }

//         for(int i=0;i<ans.size();i++){
//             sb.append(ans.get(i));
//         }

//         return sb.toString();
//     }
// }
// //         Stack<Character>stack = new Stack<>();
// //         int n = s.length();
// //         StringBuilder sb = new StringBuilder();

// //         for(int i=0;i<n;i++){
// //             char ch = s.charAt(i);

// //             if(ch == '*'){
// //                 stack.pop();
// //             }else{
// //                 stack.push(ch);
// //             }
// //         }
// //         while(!stack.isEmpty()){
// //             sb.append(stack.pop());
// //         }
// //         return sb.reverse().toString();
// //     }
// // }

public class Solution 
{
    public String clearStars(String s) 
    {
        int n = s.length();

        // Step 1: Track which characters are removed
        boolean[] removed = new boolean[n];

        // Step 2: Track indices of each character a-z
        List<Integer>[] charIndices = new ArrayList[26];
        for (int i = 0; i < 26; i++) 
        {
            charIndices[i] = new ArrayList<>();
        }

        // Step 3: Traverse string and process each character
        for (int i = 0; i < n; i++) 
        {
            char c = s.charAt(i);

            if (c == '*') 
            {
                removed[i] = true; // Remove the '*'

                // Step 3.1: Find smallest character to the left
                for (int j = 0; j < 26; j++) 
                {
                    if (!charIndices[j].isEmpty()) 
                    {
                        int idx = charIndices[j].remove(charIndices[j].size() - 1);
                        removed[idx] = true;
                        break;
                    }
                }
            } 
            else 
            {
                // Step 3.2: Add character index to tracking list
                charIndices[c - 'a'].add(i);
            }
        }

        // Step 4: Build result string
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) 
        {
            if (!removed[i] && s.charAt(i) != '*') 
            {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}