class Solution {
    public long maxProduct(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i]=Math.abs(nums[i]);
        }
        int first=-100000;
        int second=-100000;
        for(int num:nums){
            if(num>first){
                second=first;
                first=num;
            }
            else if(num>second){
                 second=num;
            }
        }
        return (long)first*(long)second*100000L;
    }
}