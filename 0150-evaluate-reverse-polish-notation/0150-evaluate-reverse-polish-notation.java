class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        int num=0;
        for(String s:tokens){
            if(!st.isEmpty() && s.equals("+")){
                int num2=st.pop();
                int num1=st.pop();
                num=num1+num2;
                st.push(num);
            }
            else if(!st.isEmpty() && s.equals("-")){
                int num2=st.pop();
                int num1=st.pop();
                num=num1-num2;
                st.push(num);
            }
            else if(!st.isEmpty() && s.equals("*")){
                int num2=st.pop();
                int num1=st.pop();
                num=num1*num2;
                st.push(num);
            }
            else if(!st.isEmpty() && s.equals("/")){
                int num2=st.pop();
                int num1=st.pop();
                num=(int)Math.floor(num1/num2);
                st.push(num);
            }
            else{
                int n=Integer.parseInt(s);
                st.push(n);
            }
        }
        return st.pop(); 
    }
}