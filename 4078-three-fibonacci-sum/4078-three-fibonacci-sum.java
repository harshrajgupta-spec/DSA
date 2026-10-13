class Solution {
    public boolean threeFibonacciSum(int n) {
        int a=0;
        int b=1;
        for(int i=0; i<n; i++){
           if((2*a+2*b)==n){
                return true;
           }
           else if((2*a+2*b)>n){
                return false;
           }
           int c=a+b;
            a=b;
            b=c;
        }
        return false;
    }
}