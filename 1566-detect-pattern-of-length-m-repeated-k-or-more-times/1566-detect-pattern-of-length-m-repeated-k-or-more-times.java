class Solution {
    public boolean containsPattern(int[] arr, int m, int k) {
        int streak=(k-1)*m;
        int count=0;
        for(int i=0; i<arr.length-m; i++){
            if(arr[i]==arr[i+m]){
                count++;
            }
            else{
                count=0;
            }
            if(count==streak){
                return true;
            }
        }
        return false;
    }
}