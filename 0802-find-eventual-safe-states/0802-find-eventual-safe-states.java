class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
          int n = graph.length;
        int[] indegree = new int[n];  // will act like outdegree in original graph
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Build reverse graph and count indegrees
        for (int from = 0; from < n; from++) {
            for (int to : graph[from]) {
                adj.get(to).add(from);  // reverse edge
                indegree[from]++;                // acts like outdegree of 'from' in original
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }

        while(!q.isEmpty()){
            int curr = q.remove();

            for(int i : adj.get(curr)){
                indegree[i]--;

                if(indegree[i] == 0)q.add(i);
            }
        }

        List<Integer>ans = new ArrayList<>();

        for(int i=0;i<indegree.length;i++){
            if(indegree[i] == 0)ans.add(i);
        }

        return ans;
    }
}