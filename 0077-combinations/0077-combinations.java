class Solution {
    public void backtrack(int f, int n, int k, List<Integer>l, List<List<Integer>> list){
            if(l.size()==k){
                list.add(new ArrayList<>(l));
                return;
            }
            int aSL=k-l.size();
            int option=n-f+1;
            for(int i=f; i<=f+(option-aSL); i++){
                l.add(i);
                backtrack(i+1, n, k, l, list);
                l.remove(l.size()-1);
            }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        backtrack(1, n, k, l, list);
        return list;
    }
}