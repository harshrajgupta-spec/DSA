class Solution {
      class Pair{
            int row;
            int col;
            Pair(int row, int col){
                this.row=row;
                this.col=col;
            }
        }
        public int bfs(int i, int j, boolean[][] vis, int[][] grid){
               Queue<Pair> q=new LinkedList<>();
               q.offer(new Pair(i, j));
               int count=0;
               while(q.size()>0){
                  Pair front=q.poll();
                  int row=front.row;
                  int col=front.col;
                  
                  if(row>0){
                     if(!vis[row-1][col] && grid[row-1][col]==1){
                        vis[row-1][col]=true;
                        q.offer(new Pair(row-1, col));
                     }
                  }
                  if(row<grid.length-1){
                     if(!vis[row+1][col] && grid[row+1][col]==1){
                        vis[row+1][col]=true;
                        q.offer(new Pair(row+1, col));
                     }
                  }
                  if(col>0){
                    if(!vis[row][col-1] && grid[row][col-1]==1){
                        vis[row][col-1]=true;
                        q.offer(new Pair(row, col-1));
                    }
                  }
                  if(col<grid[0].length-1){
                    if(!vis[row][col+1] && grid[row][col+1]==1){
                        vis[row][col+1]=true;
                        q.offer(new Pair(row, col+1));
                    }
                  }
                  count++;
               }
               return count;
        }
    public int maxAreaOfIsland(int[][] grid) {
       int max=0;
       boolean[][] vis=new boolean[grid.length][grid[0].length];

       for(int i=0; i<grid.length; i++){
          for(int j=0; j<grid[0].length; j++){
              if(!vis[i][j] && grid[i][j]==1){
                  vis[i][j]=true;
                  max=Math.max(max, bfs(i, j, vis, grid));
              }
          }
       }
        return max;
    }
}