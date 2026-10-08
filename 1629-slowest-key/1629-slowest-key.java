class Solution {
    public char slowestKey(int[] t, String k) {
        char c='a';
        int max=0;
        int prev=0;
        for(int i=t.length-1; i>=1; i--){
            t[i]=t[i]-t[i-1];
        }
        for(int i=0; i<k.length(); i++){
            if(t[i]>=max){
                if(t[i]==max){
                   char cC=k.charAt(i);
                   if(cC>c){ 
                       c=cC;
                   }
                  
                }
                else{
                    c=k.charAt(i);
                }
                max=t[i];
                prev=max;
            }
        }
        return c;
    }
}