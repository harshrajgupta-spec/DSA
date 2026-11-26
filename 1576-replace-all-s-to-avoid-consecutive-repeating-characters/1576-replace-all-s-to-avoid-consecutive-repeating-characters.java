class Solution {
    public String modifyString(String s) {
        if(s.length()==1){
            if(s.charAt(0)=='?'){
                return "a";
            }
            return s;
        }
       char a='a';
       char b='b';
       char c='c';
       char[] ch=s.toCharArray();
       if(ch[0]=='?'){
             if(ch[1]==a){
                ch[0]=b;
             }
             else{
                ch[0]=a;
             }
       }
       for(int i=1; i<s.length()-1; i++){
          if(ch[i]!='?')continue;
              if (ch[i - 1] != a && ch[i + 1] != a) {
                ch[i] = a;
            }
            else if (ch[i - 1] != b && ch[i + 1] != b) {
                ch[i] = b;
            }
            else {
                ch[i] = c;
            }
          }
       if(ch[ch.length-1]=='?'){ 
           if(ch[ch.length-2]==a || ch[ch.length-2]==b){
               ch[ch.length-1]=c;
           }
           else{
               ch[ch.length-1]=a;
           }
       }
       return new String(ch);
    }
}