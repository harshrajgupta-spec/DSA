class Solution {
    public void backtrack(Set<List<Integer>> set, List<Integer> l, int[] nums, List<Integer> idx){
        if(l.size()==nums.length){
            if(set.contains(l)){
                return;
            }else{
                set.add(new ArrayList<>(l));
            }
        }
        for(int i=0; i<nums.length; i++){
            if(idx.contains(i))continue;
            l.add(nums[i]);
            idx.add(i);
            backtrack(set, l, nums, idx);
            l.remove(l.size()-1);
            idx.remove(idx.size()-1);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Set<List<Integer>> set=new HashSet<>();
        List<Integer> l=new ArrayList<>();
        List<Integer> idx=new ArrayList<>();
        backtrack(set, l, nums, idx);
        for(var k:set){
            list.add(k);
        }
        return list;
    }
}