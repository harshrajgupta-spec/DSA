class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] arr=new int[s.length()];
        int k=0;
        while(k<s.length()){
            int idx1=-1;
            int idx2=-1;
            for(int i=k; i>=0; i--){
                if(s.charAt(i)==c){
                    idx1=i;
                    break;
                }
            }
            for(int j=k; j<s.length(); j++){
                 if(s.charAt(j)==c){
                    idx2=j;
                    break;
                 }
            }
            if(idx1==-1 && idx2!=-1){
                arr[k]=idx2-k;
                k++;
            }
            else if(idx2==-1 && idx1!=-1){
                arr[k]=k-idx1;
                k++;
            }
            else if(idx1==-1 && idx2==-1){
                arr[k]=0;
                k++;
            }
            else{
               arr[k]=Math.min(k-idx1, idx2-k);
               k++;
            }
        }
        return arr;

    }
}