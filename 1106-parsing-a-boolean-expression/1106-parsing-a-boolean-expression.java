class Solution {
    public boolean parseBoolExpr(String expression) {
       Stack<Character> st=new Stack<>();
        for(char c:expression.toCharArray()){
             if(c==',' || c=='(') continue;
             if(c=='|' || c=='&' || c=='f' || c=='t' || c=='!'){
                 st.push(c);
             }
             else if(c==')'){
                boolean t=false;
                boolean f=false;

                while(st.peek()!='!' && st.peek()!='&' && st.peek()!='|'){ 
                    char val = st.pop();
                        if(val=='f')f=true;
                        if(val=='t')t=true;
                }
                char op = st.pop();
                if(op=='!'){
                    if(t)st.push('f');
                    else st.push('t');
                }
                else if(op=='&'){ 
                    if(f)st.push('f');
                    else st.push('t');
                }
                else{
                    if(t)st.push('t');
                    else st.push('f');
                }
             }
        }
        return st.peek()=='t';
    }
}