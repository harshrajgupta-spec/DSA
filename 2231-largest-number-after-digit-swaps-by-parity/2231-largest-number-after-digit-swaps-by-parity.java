class Solution {
    public int largestInteger(int num) {
        List<Integer> odd=new ArrayList<>();
        List<Integer> even=new ArrayList<>();

        String s=String.valueOf(num);
        while(num>0){
            int d=num%10;
            if(d%2==0){
                even.add(d);
            }else{
                odd.add(d);
            }
            num/=10;
        }
        Collections.sort(odd);
        Collections.sort(even);
        int number=0;
        int idx1=even.size()-1;
        int idx2=odd.size()-1;
        for(char c:s.toCharArray()){
            int n=c-'0';
            if(n%2==0){
                number=number*10+even.get(idx1--);
            }
            else{
                number=number*10+odd.get(idx2--);
            }
        }
        return number;
    }
}