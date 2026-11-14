class Solution {
    public boolean isSubstringPresent(String s) {
        if(s.length()==1)return false;
        StringBuilder sb=new StringBuilder(s);
        String ss=sb.reverse().toString();

        sb.setLength(0);
       

        for(int i=1; i<s.length(); i++){
            sb.append(s.charAt(i-1)).append(s.charAt(i));
            if(ss.contains(sb.toString())){
                return true;
            }
           sb.setLength(0);
        }
        return false;
    }
}