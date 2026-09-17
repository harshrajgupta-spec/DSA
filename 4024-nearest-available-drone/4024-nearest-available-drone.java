class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int min=Integer.MAX_VALUE;
        int idx=-1;
        for(int i=0; i<drones.length; i++){
           int x=Math.abs(drones[i][0]-target[0]); 
           int y=Math.abs(drones[i][1]-target[1]);
           if((x+y)<=drones[i][2] && min>x+y){
               min=x+y;
               idx=i;
           }

        }
        return idx;
    }
}