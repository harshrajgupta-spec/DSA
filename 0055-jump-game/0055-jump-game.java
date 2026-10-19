class Solution {
    public boolean canJump(int[] nums) {
        int reach=nums[0];
        for(int i=0; i<nums.length; i++){
            if(reach<i){
                return false;
            }
           else if(nums[i]>=reach-i){
                reach=i+nums[i];
            }
             if(reach>=nums.length-1){
                return true;
            }  
        }
        return false;
    }
}