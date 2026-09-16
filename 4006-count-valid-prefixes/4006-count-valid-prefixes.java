class Solution {
    public int countValidPrefixes(String s) {
        int count=0;
        int zeros=0;
        int ones=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='0'){
                zeros++;
            }
            else{
                ones++;
            }
            if(i%2==0 && (zeros==ones+1 || ones==zeros+1)){
                count++;
            }
            else if(i%2==1 && zeros==ones){
                count++;
            }
       }
       return count;
    }
}