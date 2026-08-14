class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        long num=0;
        int sign=1;
        int k=0;
        if(s.length()==0)return 0;
        if(s.charAt(0)=='-'){
            k=1;
            sign=-1;
        }else if(s.charAt(0)=='+'){
             k=1;
        }
        for(int i=k; i<s.length(); i++){  
            if(!Character.isDigit(s.charAt(i))) break;
            if(Character.isDigit(s.charAt(i))){ 
                num=num*10+(s.charAt(i)-'0');
            }
            if(sign*num>Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if(sign*num<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }
        return (int)(sign*num);
    }
}