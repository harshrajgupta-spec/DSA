class Solution {
    public void backtrack(int row, Set<Integer> cols, Set<Integer> diags, Set<Integer> antiDiags, int n, char[][] game, Set<List<String>> set){
          if(row==n){
              List<String> l=new ArrayList<>();
              for(char[] c:game){
                 l.add(new String(c));
              }
              set.add(l);
              return;
          } 
          for(int col=0; col<n; col++){
              if(cols.contains(col)){
                  continue;
              }
              int diag=col-row;
              if(diags.contains(diag)){
                 continue;
              }
              int antiDiag=col+row;
              if(antiDiags.contains(antiDiag)){
                  continue;
              }
              cols.add(col);
              diags.add(diag);
              antiDiags.add(antiDiag);
              game[row][col]='Q';
              backtrack(row+1, cols, diags, antiDiags, n, game, set);
              cols.remove(col);
              diags.remove(diag);
              antiDiags.remove(antiDiag);
              game[row][col]='.';
          }
    }

    public int totalNQueens(int n) {
        Set<List<String>> set=new HashSet<>();
        Set<Integer> cols=new HashSet<>();
        Set<Integer> diags=new HashSet<>();
        Set<Integer> antiDiags=new HashSet<>();
        
        char[][] game=new char[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                game[i][j]='.';
            }
        }
        backtrack(0, cols, diags, antiDiags, n, game, set);

        return set.size();
    }
}