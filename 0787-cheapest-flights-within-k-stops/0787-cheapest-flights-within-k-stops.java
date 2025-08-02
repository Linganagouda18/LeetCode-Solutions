class Solution {
    static class Node{
        int src;
        int dest;
        int wt;

        public Node(int src , int dest , int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    static class Info{
        int v;
        int cost;
        int stops;

        public Info(int v , int cost,int stops){
            this.v=v;
            this.cost=cost;
            this.stops = stops;
        }
    }

    private void createGraph(int [][] flights , List<Node>graph[] ){
        
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }

        for(int [] fli : flights){
            int s = fli[0];
            int d = fli[1];
            int w = fli[2];

            graph[s].add(new Node(s,d,w));
        }
    }

    
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        

        List<Node>graph[] = new ArrayList[n];
        createGraph(flights,graph);

        int dist[] = new int[n];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src] = 0;

        Queue<Info>q = new LinkedList<>();
        q.add(new Info(src,0,0));

        while(!q.isEmpty()){
            Info curr = q.remove();

            for(int i=0;i<graph[curr.v].size();i++){
                Node e = graph[curr.v].get(i);

                int a = e.dest;
                int wt = e.wt;

                if(curr.cost + wt < dist[a] && curr.stops <= k){
                    dist[a] = curr.cost + wt;

                    q.add(new Info(a,dist[a] , curr.stops +1));
                }
            }
        }

        if(dist[dst] == Integer.MAX_VALUE)return -1;
        else return dist[dst];

    }
}

// class Solution {
//     public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
//         List<List<int[]>>graph = new ArrayList<>();
//         int dist[] = new int[n];
//         Arrays.fill(dist , Integer.MAX_VALUE);
//         dist[src] = 0;
//         int stops = 0;

//         for(int i=0;i<n;i++){
//             graph.add(new ArrayList<>());
//         }

//         for(int i=0;i<flights.length;i++){
//         int u = flights[i][0];
//         int v = flights[i][1];
//         int wt = flights[i][2];

//         graph.get(u).add(new int[]{v,wt});
//         }

//         PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
//         pq.add(new int[]{src, 0 , 0});


//         while(!pq.isEmpty()){
//             int[] curr = pq.remove();

//             int a = curr[0];
//             int b = curr[1];
//             int stop = curr[2];

//             if(stop > k) break;

//             for(int []i : graph.get(a)){
//                 int d = i[0];
//                 int w = i[1];

//                 if(dist[a] != Integer.MAX_VALUE && dist[a] + w < dist[d] && stop <=k){
//                     dist[d] = dist[a] + w;
//                     pq.add(new int[]{d,dist[d],stop+1});
//                 }
//             }
//         }

//          return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
//     }
// }