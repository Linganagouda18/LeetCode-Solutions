class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);
        int n = players.length;
        int m = trainers.length;
        int count = 0;
        int i=0;
        int j=0;

   while(i < n && j < m){

    if(players[i] <= trainers[j]){
        i++;
        j++;
        count++;
    }else if(players[i] > trainers[j]){
        j++;
    }
   }

   return count;
    }
}