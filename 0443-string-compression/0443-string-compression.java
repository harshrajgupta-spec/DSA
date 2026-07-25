class Solution {
    public int compress(char[] chars) {
        int k=0;
        int count=0;
        char c=chars[0];
        for(int i=0; i<chars.length; i++){
           if(chars[i]==c){
             count++;
           }
           if(chars[i]!=c){
               chars[k]=c;
               k++;
               if(count>1 && count<10){
                  chars[k]=(char)(count+'0');
                  k++;
               }
               else if(count>=10){
                   String s=String.valueOf(count);
                   for(int j=0; j<s.length(); j++){
                       chars[k]=s.charAt(j);
                       k++;
                   }
               }
               c=chars[i];
               count=1;

           }

        }
         chars[k++] = c;
            if (count > 1) {
            String s = String.valueOf(count);
            for (char ch : s.toCharArray()) {
                chars[k++] = ch;
            }
        }
        return k;
    }
}