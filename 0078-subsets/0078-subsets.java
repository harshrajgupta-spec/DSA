class Solution {
    public void backtrack(int idx, int[] nums,  List<Integer> list, List<List<Integer>> res){
           res.add(new ArrayList<>(list));
           for(int i=idx; i<nums.length; i++){
               list.add(nums[i]);
               backtrack(i+1, nums, list, res);
               list.remove(list.size()-1);
           }
     }
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        backtrack(0, nums, list, res);
       
        return res;
    }
}