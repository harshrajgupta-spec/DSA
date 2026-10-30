class Solution {
    public boolean isVowel(char c){
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U';
    }
    public String toGoatLatin(String sentence) {
        String[] ss=sentence.split(" "); 
        StringBuilder sb1=new StringBuilder();
        for(int i=0; i<ss.length; i++){
            StringBuilder sb2=new StringBuilder();
            String s=ss[i];
            int n=i+1;
            if(!isVowel(s.charAt(0))){
                String s1=s.substring(1);
                sb2.append(s1).append(s.charAt(0)).append("ma");
                
                while(n>0){
                    sb2.append('a');
                    n--;
                }
            }
            else{
                sb2.append(s).append("ma");
                while(n>0){
                    sb2.append('a');
                    n--;
                }
            }
            sb1.append(sb2).append(" ");
        }
        String s2=sb1.toString();
        return s2.substring(0, s2.length()-1);
    }
}