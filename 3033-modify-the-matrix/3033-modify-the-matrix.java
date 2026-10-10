class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int[] col=new int[matrix[0].length];
        int max=-2;
        for(int i=0; i<matrix[0].length; i++){
            for(int j=0; j<matrix.length; j++){
                 max=Math.max(max, matrix[j][i]);
            }
            col[i]=max;
            max=0;
        }
        int[][] mat=new int[matrix.length][matrix[0].length];
        for(int i=0; i<matrix[0].length; i++){
            for(int j=0; j<matrix.length; j++){
                mat[j][i]=matrix[j][i];
                if(mat[j][i]==-1){
                    mat[j][i]=col[i];
                }
            }
        }
        return mat;
    }
}