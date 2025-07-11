class Solution {
    
    public int maxUniqueSplit(String s) {
        HashSet<String>set = new HashSet<>();

        return helper(0 , set , s);
        
    }

    private int helper(int index , HashSet<String>set , String s){
        //base case
        if(index == s.length()){
            return 0;
        }
int maxi = 0;

        for(int i=index+1; i<=s.length();i++){
            String str = s.substring(index , i);

            if(!set.contains(str)){
                set.add(str);

               int temp = 1 + helper(i , set , s);
               maxi = Math.max(maxi , temp);

               set.remove(str);
            }
        }
        return maxi;
    }
}
    //     HashSet<String>set = new HashSet<>();
    //     StringBuilder sb = new StringBuilder();

    //     helper(s , set , 0 , sb);
    //     return maxi;
    // }

    // private void helper(String s , HashSet<String>set , int i , StringBuilder sb){
    //     if(i == s.length()){
    //         maxi = Math.max(maxi , set.size());
    //     }
    //     sb.append(s.charAt(i));

    //     if(!set.contains(sb)){
    //         String temp = sb.toString();
    //         set.add(temp);
    //         helper(s , set , i+1 , new StringBuilder());
    //     }

    //     if(set.contains(sb)){
    //         helper(s , set, i+1,sb);
    //     }
//     }
// }