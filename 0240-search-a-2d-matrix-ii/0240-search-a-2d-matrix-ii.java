class Solution {
    public boolean searchHelper(int[][] m, int left, int right, int top, int bottom, int target){
          if(left>right)return false;
          if(top>bottom)return false;

          int mid=left+(right-left)/2;
          int r=top;
          while(r<=bottom && m[r][mid]<=target){  
               if(m[r][mid]==target){
                  return true;
               }
               r=r+1;
          }
          return searchHelper(m, left, mid-1, r, bottom, target) || searchHelper(m, mid+1, right, top, r-1, target);
    }
    public boolean searchMatrix(int[][] matrix, int target) {
       return searchHelper(matrix, 0, matrix[0].length-1, 0, matrix.length-1, target);
    }
}