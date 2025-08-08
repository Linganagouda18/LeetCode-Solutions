import java.util.*;

class Solution {

    public int nearestExit(char[][] maze, int[] entrance) {
        int[] dRow = {-1, 1, 0, 0};
        int[] dCol = {0, 0, -1, 1};

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{entrance[0], entrance[1], 0});
        maze[entrance[0]][entrance[1]] = '+';

        while (!q.isEmpty()) {
            int[] curr = q.remove();
            int u = curr[0];
            int v = curr[1];
            int steps = curr[2];

            if ((u == 0 || v == 0 || u == maze.length - 1 || v == maze[0].length - 1) &&
                !(u == entrance[0] && v == entrance[1])) {
                return steps;
            }

            for (int i = 0; i < 4; i++) {
                int r = u + dRow[i];
                int c = v + dCol[i];

                if (r >= 0 && r < maze.length && c >= 0 && c < maze[0].length && maze[r][c] == '.') {
                    q.add(new int[]{r, c, steps + 1});
                    maze[r][c] = '+';
                }
            }
        }

        return -1;
    }
}
