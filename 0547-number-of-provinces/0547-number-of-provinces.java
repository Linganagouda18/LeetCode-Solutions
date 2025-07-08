import java.util.*;

class Edge {
    int src, dest;
    Edge(int src, int dest) {
        this.src = src;
        this.dest = dest;
    }
}

public class Solution {

    private void dfs(int node, boolean[] vis, ArrayList<Edge>[] graph) {
        vis[node] = true;
        for (Edge e : graph[node]) {
            if (!vis[e.dest]) {
                dfs(e.dest, vis, graph);
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;

        // Step 1: Create graph
        ArrayList<Edge>[] graph = new ArrayList[n];
        for (int i = 0; i < n; i++) graph[i] = new ArrayList<>();

        // Step 2: Convert matrix to adjacency list
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (isConnected[i][j] == 1 && i != j) {
                    graph[i].add(new Edge(i, j));
                }
            }
        }

        // Step 3: Count provinces using DFS
        boolean[] vis = new boolean[n];
        int provinces = 0;
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                dfs(i, vis, graph);
                provinces++;
            }
        }

        return provinces;
    }
}
