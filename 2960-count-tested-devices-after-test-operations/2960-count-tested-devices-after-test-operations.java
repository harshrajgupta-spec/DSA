class Solution {
    public int countTestedDevices(int[] b) {
        int count=0;
        for(int n:b){
            if(n>count){
                count++;
            }
        }
        return count;
    }
}