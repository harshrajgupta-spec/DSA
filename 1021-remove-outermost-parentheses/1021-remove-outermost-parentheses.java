class Solution {
    public String removeOuterParentheses(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        char[] c=s.toCharArray();
        int count=0;
        for(int i=0; i<n; i++){
            if(c[i]=='(' && count++>0){
                sb.append(c[i]);
            }
            else if(c[i]==')' && count-->1){
                sb.append(c[i]);
            }
        }
        return sb.toString();
    }
}