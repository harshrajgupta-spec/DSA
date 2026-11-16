class Solution {
    class Pair{
        int row=0;
        int col=0;
        Pair(int row, int col){
            this.row=row;
            this.col=col;
        }
    }
    public void bfs(int i, int j, boolean[][] vis, char[][] grid){
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(i, j));
        while(q.size()>0){
            Pair front=q.poll();
            int row=front.row;
            int col=front.col;

            if(row>0){
                if(!vis[row-1][col] && grid[row-1][col]=='1'){
                    vis[row-1][col]=true;
                    q.offer(new Pair(row-1, col));
                }
            }
            if(row<grid.length-1){
                if(!vis[row+1][col] && grid[row+1][col]=='1'){
                    vis[row+1][col]=true;
                    q.offer(new Pair(row+1, col));
                }
            }
            if(col>0){
                if(!vis[row][col-1] && grid[row][col-1]=='1'){
                    vis[row][col-1]=true;
                    q.offer(new Pair(row, col-1));
                }
            }
            if(col<grid[0].length-1){
                if(!vis[row][col+1] && grid[row][col+1]=='1'){
                    vis[row][col+1]=true;
                    q.offer(new Pair(row, col+1));
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] vis=new boolean[m][n];
        int count=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(!vis[i][j] && grid[i][j]=='1'){
                    bfs(i, j, vis, grid);
                    count++;
                }
            }
        }
        return count;
    }
}