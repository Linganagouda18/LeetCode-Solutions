class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        int n = instructions.length;
        long score = 0;
        int i = 0;
        boolean[] visited = new boolean[n];
        
        while (i >= 0 && i < n && !visited[i]) {
            visited[i] = true;
            
            if (instructions[i].equals("add")) {
                score += values[i];
                i++;
            } else { 
                i += values[i];
            }
        }

        return score;
    }
}