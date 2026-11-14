class Solution {
    public void bfs(boolean[] visited, int i, int[][] isConnected){
           Queue<Integer> q=new LinkedList<>();
           q.offer(i);
           visited[i]=true;
           while(q.size()>0){
              int row=q.poll();
              for(int col=0; col<isConnected.length; col++){
                  if(isConnected[row][col]==1 && !visited[col]){
                       q.offer(col);
                       visited[col]=true; 
                  }
              }
           }
    }
    public int findCircleNum(int[][] isConnected) {
        int count=0;
        boolean[] visited=new boolean[isConnected.length];
        for(int i=0; i<isConnected.length; i++){
            if(!visited[i]){
                bfs(visited, i, isConnected);
                count++;
            }
        }
        return count;
    }
}