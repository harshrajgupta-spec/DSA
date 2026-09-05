class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] arr=new int[2];
        int idx=0;
        int max=-1;
        int sum=0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                sum+=mat[i][j];
            }
            if(sum>max){
                idx=i;
                max=sum;
            }
           
            sum=0;
        }
        arr[0]=idx;
        arr[1]=max;
        return arr;
    }
}