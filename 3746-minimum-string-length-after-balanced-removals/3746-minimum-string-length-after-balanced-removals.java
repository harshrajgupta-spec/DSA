class Solution {
    public int minLengthAfterRemovals(String s) {
        int a=0;
        int b=0;
        for(char c:s.toCharArray()){
            if(c=='a'){
                a++;
            }
            else{
                b++;
            }
        }
        int remove=Math.min(a, b);
        return s.length()-(remove*2);
    }
}