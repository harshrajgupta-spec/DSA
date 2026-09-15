class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        List<Long> list=new ArrayList<>();
        Stack<Long> st=new Stack<>(); 
        for(int num:nums){
            long n=(long)num;
            while(!st.isEmpty() && n==st.peek()){
                n=n+st.pop(); 
            }
            st.push(n);
        }
        Long[] arr=new Long[st.size()];
        int i=arr.length-1;
        while(!st.isEmpty()){
            arr[i]=st.pop();
            i--;
        }
        for(int j=0; j<arr.length; j++){ 
            list.add(arr[j]); 
        }
        return list;
    }
}