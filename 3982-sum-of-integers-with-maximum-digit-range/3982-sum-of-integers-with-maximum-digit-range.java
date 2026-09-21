class Solution {
    public int maxDigitRange(int[] nums) {
        int sum=0;
        int range=0;
        for(int i=0; i<nums.length; i++){
            int n=nums[i];
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            while(n>0){
                int d=n%10;
                max=Math.max(max, d);
                min=Math.min(min, d);
                n/=10;
            }
            int newRange=max-min;
            if(newRange>range){
                sum=nums[i];
                range=newRange;
            }
            else if(newRange==range){
                 sum+=nums[i];
            }
        }
        return sum;
    }
}