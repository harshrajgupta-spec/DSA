class Solution {
    public String reformatNumber(String number) {
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=0; i<number.length(); i++){
            if(Character.isDigit(number.charAt(i))){
                sb.append(number.charAt(i));
                count++;
                if(count==3){
                    sb.append('-');
                    count=0;
                }
            }
        }

        String s=sb.toString();
        if(s.charAt(s.length()-1)=='-'){ //3
            return s.substring(0, s.length()-1);
        }
        else if(s.charAt(s.length()-2)=='-'){
            char[] c=s.toCharArray();
            char temp=c[c.length-3];
            c[c.length-3]=c[c.length-2];
            c[c.length-2]=temp;
            return new String(c);
        }
        return s;
    }
}