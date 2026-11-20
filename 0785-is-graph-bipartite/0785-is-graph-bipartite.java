class Solution {
    boolean ans=true;
    public void bfs(int i, int[] vis, int[][] graph){
          vis[i]=0;
          Queue<Integer> q=new LinkedList<>();
          q.offer(i);
          while(q.size()>0){
              int front=q.poll();
              int color=vis[front];
              for(int ele:graph[front]){
                  if(vis[ele]==vis[front]){
                     ans=false;
                     return;
                  }
                  if(vis[ele]==-1){
                     q.offer(ele);
                     vis[ele]=1-color;
                  }
              }
          }
    }
    public boolean isBipartite(int[][] graph) {
        int[] vis=new int[graph.length];
        Arrays.fill(vis, -1);
        for(int i=0; i<graph.length; i++){
            if(vis[i]==-1){
               bfs(i, vis, graph);
            }
        }
        return ans;
    }
}