class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max=0;
        int len=1;
        for(int i=1; i<nums.length; i++){
            if(nums[i]>nums[i-1]){
                len++;
            }
            else{
                max=Math.max(max, len);
                len=1;
            }
        }
        max=Math.max(len, max);
        len=1;
         for(int i=1; i<nums.length; i++){
            if(nums[i]<nums[i-1]){
                len++;
            }
            else{
                max=Math.max(max, len);
                len=1;
            }
        }
        max=Math.max(len, max);
        return max;
    }
}