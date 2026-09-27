class Solution {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> list1=new ArrayList<>();
       
       
        for(int i=0; i<n; i++){
            List<Integer> list2=new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || i==j){
                    list2.add(1);
                }
                else{
                    int l=list1.get(list1.size()-1).get(j)+list1.get(list1.size()-1).get(j-1);    
                    list2.add(l);
                }
            }
            list1.add(list2);
           
           
        }
        return list1;
    }
}