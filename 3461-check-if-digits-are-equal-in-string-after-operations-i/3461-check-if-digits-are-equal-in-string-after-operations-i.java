class Solution {
    public boolean hasSameDigits(String s) {
        ArrayList<Integer>ans = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            ans.add(Integer.parseInt(String.valueOf(s.charAt(i))));
        }

        while(ans.size() != 2){
            for(int i=0;i<ans.size()-1;i++){
                // ans.get(i) = (ans.get(i) + ans.get(i+1))% 10;
                ans.set(i,(ans.get(i) + ans.get(i+1))% 10);
            }

            ans.remove(ans.size()-1);
        }

        return ans.get(0) == ans.get(1);
        
    }
}