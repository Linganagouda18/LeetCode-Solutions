class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>>ans =  new ArrayList<>();
        int n = numCourses;
        boolean vis[] = new boolean[numCourses];
        boolean stack[] = new boolean[numCourses];
        for(int i=0;i<numCourses;i++){
           ans.add(new ArrayList<>());
        }

        for(int [] preq : prerequisites){
            ans.get(preq[0]).add(preq[1]);
        }

        for(int i=0;i<numCourses;i++){
            if(!vis[i]){
               if( dfs(ans,i,vis,stack,n)) return false;
            }
        }
        return true;
    }

    private boolean dfs(List<List<Integer>>ans, int curr , boolean vis[] , boolean stack[] , int a){
        vis[curr] = true;
        stack[curr] = true;

        for (int i = 0; i < ans.get(curr).size(); i++) {
            int val = ans.get(curr).get(i);

            if (!vis[val] && dfs(ans, val, vis, stack,a)) {
                return true;
            }

            if (stack[val]) {
                return true;
            }
        }

        stack[curr] = false;
        return false;
    }
}