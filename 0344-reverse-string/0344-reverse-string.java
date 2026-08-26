class Solution {
    public void reverse(char[] s, int start, int end){
        if(start>=end){
            return;
        }
        char temp=s[start];
        s[start]=s[end];
        s[end]=temp;
        start++;
        end--;
        reverse(s, start, end);
    }
    public void reverseString(char[] s) {
           reverse(s, 0, s.length-1);
    }
}