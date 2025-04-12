class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<String,Integer>map = new HashMap<>();
        HashMap<String,Integer>map1 = new HashMap<>();
        int count = 0;

        

       for (int i = 0; i < grid.length; i++) {
           String str = "";
            for (int j = 0; j < grid[i].length; j++) {
                String st = String.valueOf(grid[i][j]);
               str +=st; 
            }
          map.put(str,map.getOrDefault(str,0)+1);
        }

        for (int col = 0; col < grid[0].length; col++) {
          String str1 = "";
            
            
            for (int row = 0; row < grid.length; row++) {
               String st = String.valueOf(grid[row][col]);
               str1 += st;
            }
           if(map.containsKey(str1)){
            count += map.get(str1);
           }
        }

        

        return count;
        
    }
}