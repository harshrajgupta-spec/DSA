class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int len=0;
        int min=0;
        int ones=0;
        int zeroes=0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='0' && ones>0){
                min=Math.min(ones, zeroes);
                len=Math.max(len, min+min);
                zeroes=1;
                ones=0;
            }
            else if(s.charAt(i)=='0'){
                zeroes++;
            }
            else{
                ones++;
            }
        }
        if(s.charAt(s.length()-1)=='1'){
             min=Math.min(ones, zeroes);
             len=Math.max(len, min+min);
        }
        return len;
    }
}