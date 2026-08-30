class Solution {
    public int minimumDeletions(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int currMax=Integer.MIN_VALUE;
        int currMin=Integer.MAX_VALUE;
        int minIdx=0;
        int maxIdx=0;
        for(int i=0; i<nums.length; i++){
            max=Math.max(max, nums[i]);
            min=Math.min(min, nums[i]);
            if(max!=currMax){
                maxIdx=i;
            }
            if(min!=currMin){
                minIdx=i;
            }
            currMax=max;
            currMin=min;
        }
        int num1=Math.max(maxIdx, minIdx)+1;
        int num2=nums.length-Math.min(maxIdx, minIdx);
        int num3=Math.min(maxIdx, minIdx)+1+(nums.length-Math.max(maxIdx, minIdx)); 

        return Math.min(num1, Math.min(num2, num3));
    }
}