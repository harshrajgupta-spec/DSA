class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        List<Integer> list=new ArrayList<>();
        boolean check=true;

        for(int i=0; i<grid.length; i++){
          if(check){
            for(int j=0; j<grid[0].length; j+=2){
                list.add(grid[i][j]);
            }
          }
          else{
             if(grid[0].length%2==0){
                for(int k=grid[0].length-1; k>=0; k-=2){
                    list.add(grid[i][k]);
                }
             }
             else{
                for(int l=grid[0].length-2; l>=0; l-=2){
                    list.add(grid[i][l]);
                }
             }
          }
          if(check){
             check=false;
          }
          else{
            check=true;
          }
        }
        return list;
    }
}