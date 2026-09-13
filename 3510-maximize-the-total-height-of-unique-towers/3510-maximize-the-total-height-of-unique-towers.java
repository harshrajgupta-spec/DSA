class Solution {
    public long maximumTotalSum(int[] m) {
        long sum=0;
        Arrays.sort(m);
       int i=0;
       int j=m.length-1;
       while(i<j){
          int temp=m[i];
          m[i]=m[j];
          m[j]=temp;
          i++;
          j--;
       }
       int curr=m[0];
       for(int l=0; l<m.length; l++){ 
           curr=Math.min(m[l], curr);
           if(curr<=0){
              return -1;
           }
           sum+=curr;
           curr--;

       }
       return sum;
    }
}