class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<s.length(); i++){
            int ascii=s.charAt(i);
            String ss = String.format("%8s",
                        Integer.toBinaryString(ascii)).replace(' ', '0');
            sb.append(ss);
        }
        int j=0;
        int k=sb.length()-1;
        while(j<k){
            if(sb.charAt(j)!=sb.charAt(k)){
                return false;
            }
            j++;
            k--;
        }
        return true;
    }
}