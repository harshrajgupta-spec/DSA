class Solution {
    public boolean isVowel(char c){
            return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
          }
    public int vowelConsonantScore(String s) {
         int v=0;
         int c=0;
         
         for(char ch:s.toCharArray()){
             if(isVowel(ch)){
                v++;
             }else if(!Character.isLetter(ch)){
                continue;
             }
             else{
                c++;
             }
         }
         if(c==0)return 0;
         return v/c;
    }
}