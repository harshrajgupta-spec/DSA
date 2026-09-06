class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i=0; i<nums.length; i+=2){
            while(nums[i]>0){
                list.add(nums[i+1]);
                nums[i]--;
            }
        }
        int[] arr=new int[list.size()];
        for(int i=0; i<list.size(); i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}