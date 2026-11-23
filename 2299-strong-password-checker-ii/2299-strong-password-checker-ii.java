class Solution {
    public boolean strongPasswordCheckerII(String p) {
        if(p.length()<8){
            return false;
        }
        boolean lc=false;
        boolean uc=false;
        boolean dig=false;
        boolean sc=false;
        for(int i=1; i<p.length(); i++){
            if(p.charAt(i)==p.charAt(i-1)){
                return false;
            }
            if(Character.isDigit(p.charAt(i))){
                dig=true;
            }
            else if(p.charAt(i)>='a' && p.charAt(i)<='z'){
                lc=true;
            }
            else if(p.charAt(i)>='A' && p.charAt(i)<='Z'){
                uc=true;
            }
            else{
                sc=true;
            }
        }
            if(Character.isDigit(p.charAt(0))){
                dig=true;
            }
            else if(p.charAt(0)>='a' && p.charAt(0)<='z'){
                lc=true;
            }
            else if(p.charAt(0)>='A' && p.charAt(0)<='Z'){
                uc=true;
            }
            else{
                sc=true;
            }
        return sc && uc && lc && dig;
    }
}