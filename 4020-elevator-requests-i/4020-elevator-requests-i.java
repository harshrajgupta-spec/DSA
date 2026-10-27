class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int sec=0;
        int floor=0;
        for(int i=0; i<requests.length; i++){
            sec+=Math.abs(requests[i]-floor);
            floor=requests[i];
        }
        return sec;
    }
}