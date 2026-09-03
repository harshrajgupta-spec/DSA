class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Integer> s=new Stack<>();
        for(int i=0; i<num.length(); i++){
            int n=num.charAt(i)-'0';
            while(!s.isEmpty() && n<s.peek() && k>0){
                s.pop();
                k--;
            }
            s.push(n);
        }
        if(k>0){
            while(!s.isEmpty() && k>0){
                s.pop();
                k--;
            }
        }
        StringBuilder sb=new StringBuilder();

        while (!s.isEmpty()) {
            sb.append(s.pop());
        }

        sb.reverse();

        
        int i=0;
        while(i<sb.length() && sb.charAt(i)=='0') {
            i++;
        }

        if (i==sb.length()) {
            return "0";
        }

        return sb.substring(i);
    }
}