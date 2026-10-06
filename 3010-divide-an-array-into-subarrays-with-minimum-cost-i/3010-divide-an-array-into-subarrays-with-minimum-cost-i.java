class Solution {
    public int minimumCost(int[] nums) {
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;
        for(int i=1; i<nums.length; i++){
            if(nums[i]<=first && nums[i]<=second){
                second=first;
                first=nums[i];
            }
            else if(nums[i]<=second && nums[i]>=first){
                second=nums[i];
            }
        }
        return nums[0]+first+second;

    }
}