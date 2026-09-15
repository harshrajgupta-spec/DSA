class Solution {
    public String resultingString(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(!st.isEmpty() && (Math.abs(s.charAt(i)-st.peek())==1 || Math.abs(s.charAt(i)-st.peek())==25)){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        return sb.toString();
    }
}