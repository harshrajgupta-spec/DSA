class Solution {
   public boolean isCollinear(int x1, int y1, int x2, int y2, int x3, int y3){
               return (y2 - y1) * (x3 - x1) == (y3 - y1) * (x2 - x1);
            }
    public boolean checkStraightLine(int[][] c) {
           for(int i=0; i<c.length-2; i++){
                if(!isCollinear(c[i][0], c[i][1], c[i+1][0], c[i+1][1], c[i+2][0], c[i+2][1])){
                    return false;
                }
           }
           return true;
    }
}