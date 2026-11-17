class Solution {
    class Pair{
        int row;
        int col;
        Pair(int row, int col){
            this.row=row;
            this.col=col;
        }
    }
    public void bfs(int i, int j, boolean[][] vis, char[][] board){
        Queue<Pair> q=new LinkedList<>();
        q.offer(new Pair(i, j));
        while(q.size()>0){
            Pair front=q.poll();
            int row=front.row;
            int col=front.col;
            if(row>0){
                if(!vis[row-1][col] && board[row-1][col]=='O'){
                    vis[row-1][col]=true;
                    q.offer(new Pair(row-1, col));
                }
            }
            if(row<vis.length-1){
                if(!vis[row+1][col] && board[row+1][col]=='O'){
                    vis[row+1][col]=true;
                    q.offer(new Pair(row+1, col));
                }
            }
            if(col>0){
                if(!vis[row][col-1] && board[row][col-1]=='O'){
                    vis[row][col-1]=true;
                    q.offer(new Pair(row, col-1));
                }
            }
            if(col<vis[0].length-1){
                if(!vis[row][col+1] && board[row][col+1]=='O'){ 
                    vis[row][col+1]=true; 
                    q.offer(new Pair(row, col+1));
                }
            }
        }
    }
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        boolean[][] vis=new boolean[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if((i==0 || i==m-1 || j==0 || j==n-1) && !vis[i][j] && board[i][j]=='O'){
                    vis[i][j]=true;
                    bfs(i, j, vis, board);
                }
            }
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
               if(!vis[i][j]){
                  board[i][j]='X';
               }
            }
        }

    }
}