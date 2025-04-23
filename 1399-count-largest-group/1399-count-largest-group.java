class Solution {
    public int countLargestGroup(int n) {
    HashMap<Integer,Integer>map = new HashMap<>();
    int count = 0;

    for(int i=1;i<=n;i++){
        if(i <= 9){
            map.put(i , map.getOrDefault(i,0)+1);
        }else{

            int sum = 0;
            int j = i;

            while(j > 0){
                int temp = j % 10;
                sum += temp;
                j /=10;
            }
            if( map.containsKey(sum)){
               map.put(sum , map.getOrDefault(sum,0)+1);
               count++;
            }
        }
    }
        if(count == 0)return n;
        else return count;
    }
}