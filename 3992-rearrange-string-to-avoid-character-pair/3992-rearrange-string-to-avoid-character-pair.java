class Solution {
    public String rearrangeString(String s, char x, char y) {
        char[] c=s.toCharArray();
        int i=0;
        int j=c.length-1;
        while(i<j){
            if(c[i]==x && c[j]==y){
                char temp=c[i];
                c[i]=c[j];
                c[j]=temp;
            }
            else if((c[i]==x && c[j]!=y) || c[j]==x){
                j--;
            }
            else if((c[i]!=x && c[j]!=y) || c[i]==y || c[j]==y){
                i++;
            }
            else{
                i++;
                j--;
            }
        }
        return new String(c);
    }
}