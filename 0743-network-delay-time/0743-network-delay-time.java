class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>>graph = new    ArrayList<>();
        int maxi = 0;

        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        for(int []edge : times){
            int u =edge[0]-1;
            int v =edge[1]-1;
            int wt=edge[2];

            graph.get(u).add(new int[]{v,wt});
        }

        int dist[] = new int[n];
        Arrays.fill(dist , Integer.MAX_VALUE);
        dist[k-1] = 0;

        PriorityQueue<int[]>pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
       pq.add(new int[]{k-1 , 0});
        while(!pq.isEmpty()){
            int[] edge = pq.remove();
            int node = edge[0];
            int d = edge[1];

            if(d > dist[node]) continue;

            for(int neigh[] : graph.get(node)){
                int a = neigh[0] ;
                int w =  neigh[1];

                if(dist[node] + w < dist[a]){
                    dist[a] = dist[node] + w;
                    pq.add(new int[]{a,dist[a]});
                }
            }

        }

        for(int i=0;i<dist.length;i++){
            if(dist[i] == Integer.MAX_VALUE) return -1;
            else maxi = Math.max(dist[i] , maxi);
        }

        return maxi;

        
    }
}