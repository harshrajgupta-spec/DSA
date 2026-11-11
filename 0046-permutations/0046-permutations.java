class Solution {
    public void backtrack(List<List<Integer>> list, List<Integer> l, int[]nums){
        if(l.size()==nums.length){
            list.add(new ArrayList<>(l));
            return;
        }
            for(int i=0; i<nums.length; i++){
                if(l.contains(nums[i]))continue;
                l.add(nums[i]);
                backtrack(list, l, nums);
                l.remove(l.size()-1);
            }
        
    }
    public List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> list=new ArrayList<>();
         List<Integer> l=new ArrayList<>();
         backtrack(list, l, nums);
         return list;
    }
}