class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int id=n;
        int time=0;
        int maxTime=0;
        int newMax=0;
        for(int i=0; i<logs.length; i++){
            maxTime=logs[i][1]-time;
            time=logs[i][1];
            if(maxTime>=newMax){
                if(maxTime==newMax){
                    id=Math.min(id, logs[i][0]);
                }
                else{
                    id=logs[i][0];
                }
                newMax=maxTime;
            }
        }
        return id;
    }
}