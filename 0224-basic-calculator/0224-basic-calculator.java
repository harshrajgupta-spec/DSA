class Solution {
    public int calculate(String s) {
        int result=0;
        int sign=1;
        int n=0;
        Stack<Integer> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                n=n*10+(c-'0');
            }
            else if(c=='+'){
                result+=sign*n;
                n=0;
                sign=1;
            }
            else if(c=='-'){
                result+=sign*n;
                n=0;
                sign=-1;
            }
            else if(c=='('){
                st.push(result);
                st.push(sign);
                result=0;
                sign=1;
            }
            else if(c==')'){
                result+=sign*n;
                n=0;
                result*=st.pop();
                result+=st.pop();
            }
        }
        result+=sign*n;
        return result;
    }
}