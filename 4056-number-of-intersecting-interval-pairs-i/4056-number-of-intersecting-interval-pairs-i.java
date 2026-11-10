class Solution {
    public int countIntersectingIntervals(int[][] m) {
        int count=0;
        for(int i=0; i<m.length; i++){
            for(int j=i+1; j<m.length; j++){
             if(Math.max(m[i][0], m[j][0])<=Math.min(m[i][1], m[j][1])){
               count++;
              }
           }
        }
        return count;
    }
}