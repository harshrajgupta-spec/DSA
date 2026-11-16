class Solution {
    public int findPermutationDifference(String s, String t) {
        int sum=0;
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            sum+=(Math.abs(s.indexOf(c)-t.indexOf(c)));
        }
        return sum;
    }
}