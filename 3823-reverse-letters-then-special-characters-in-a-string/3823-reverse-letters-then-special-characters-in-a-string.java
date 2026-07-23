class Solution {
    public String reverseByType(String s) {
        char[] c=s.toCharArray();
          int i=0;
          int j=s.length()-1;
          while(i<j){
             if(Character.isLetter(c[i]) && Character.isLetter(c[j])){
                  char temp=c[i];
                  c[i]=c[j]; 
                  c[j]=temp;
                  i++;
                  j--;
             }
             else if(Character.isLetter(c[i]) && !Character.isLetter(c[j])){
                  j--;
             }
             else if(!Character.isLetter(c[i]) && Character.isLetter(c[j])){
                i++;
             }
             else{
                i++;
                j--;
             }
          }
          i=0;
          j=s.length()-1;
          while(i<j){
             if(!Character.isLetter(c[i]) && !Character.isLetter(c[j])){
                  char temp=c[i];
                  c[i]=c[j];
                  c[j]=temp;
                  i++;
                  j--;
             }
             else if(Character.isLetter(c[i]) && !Character.isLetter(c[j])){
                  i++;
             }
             else if(!Character.isLetter(c[i]) && Character.isLetter(c[j])){
                j--;
             }
             else{
                i++;
                j--;
             }
          }
          return new String(c);
    }
}