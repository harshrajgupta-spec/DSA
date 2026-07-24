class Solution {
    public boolean hasSpecialSubstring(String s, int k) {
        if(k==1 && s.length()==1)return true;
        int count=0;
        char c=s.charAt(0);
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)==c){
                count++;
            }
            else{
                count=1;
                c=s.charAt(i);
            }
            if(s.charAt(i)!=s.charAt(i+1) && count==k){
                return true;
            }
           
        }
        if(s.length()>1 && s.charAt(s.length()-2)==s.charAt(s.length()-1)){ 
            count++;
            if(count==k)return true;
        }
        if(s.length()>1 && s.charAt(s.length()-2)!=s.charAt(s.length()-1) && k==1){ 
            return true;
        }
        
        return false;
    }
}