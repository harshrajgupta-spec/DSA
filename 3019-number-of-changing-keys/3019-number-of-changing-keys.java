class Solution {
    public int countKeyChanges(String s) {
        String ss=s.toLowerCase();
        int count=0;
        for(int i=1; i<s.length(); i++){
            if(ss.charAt(i)!=ss.charAt(i-1)){
                count++;
            }
        }
        return count;
    }
}