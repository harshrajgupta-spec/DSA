class Solution {
    public int semiOrderedPermutation(int[] nums) {
        int first=0;
        int last=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1)first=i;
            if(nums[i]==nums.length)last=i;
        }
        int swap=(first-0)+(nums.length-1-last);
        if(first>last){
            return swap-1;
        }
        return swap;
    }
}