// class Solution {
//     public boolean hasSpecialSubstring(String s, int k) {
//         int n = s.length();
//         HashMap<Character,Integer>map = new HashMap<>();
        

        
//         if(n == 1 && k == 1 )return true;
//         // if(k == 1)return true;
//         int i =0;
//         int j=0;

//         while(j<n){
//             char ch = s.charAt(i);
//             char ch1 = s.charAt(j);

//             map.put(s.charAt(j) , map.getOrDefault(s.charAt(j),0)+1);

//             if(j-i+1 == k){
//                 if(map.size() == 1){
//                     int count = 0;

//                     if(j<n-1){
//                         char c = s.charAt(j+1);
//                         if(s.charAt(j) ==c)break;
//                     }

//                     if(i >0){
//                         char cc = s.charAt(i-1);
//                         if(s.charAt(i) == cc)break;
//                     }


//                     return true;
//                 }
//                     map.put(s.charAt(i),map.get(s.charAt(i))-1);
//                     if(map.get(s.charAt(i)) == 0)map.remove(s.charAt(i));
//                     i++;
                    
                
//             }
//                 j++;
//         }


//         return false;
        
//     }
// }

class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
      
        int count = 1; 
        for (int i = 1; i < s.length(); i++) {
           
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } 
            else {
                if (count == k) {
                    return true;
                }
                count = 1;
            }
        }
        return count == k;
    }
}