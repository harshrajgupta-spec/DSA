class Solution {
    public long gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }
    public long maxPairStrength(int[] nums) {
        long max=Long.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                long m=(long)nums[i]*nums[j];
                long n=gcd(nums[i], nums[j]);
                 max=Math.max(max, m/(n*n));
            }
        }
        return max;
        
    }
}