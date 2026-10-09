class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int[] arr=new int[grid[0].length];
        for(int i=0; i<grid[0].length; i++){
            int len=0;
              for(int j=0; j<grid.length; j++){
                String s=String.valueOf(grid[j][i]);
                    len=Math.max(len, s.length());
            }
            arr[i]=len;
        }
        return arr;
    }
}