class Solution {
    public long gcd(long a, long b){
        while(b!=0){
            long temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public long lcm(long a, long b){
        return (a/gcd(a,b))*b;
    }
    public long maxScore(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0]*nums[0];
        long[] prefLcm=new long[nums.length];
        long[] suffLcm=new long[nums.length];
        long[] prefGcd=new long[nums.length];
        long[] suffGcd=new long[nums.length];

        long result=0;
        prefLcm[0]=nums[0];
        prefGcd[0]=nums[0];
        suffLcm[nums.length-1]=nums[nums.length-1];
        suffGcd[nums.length-1]=nums[nums.length-1];
        for(int i=1; i<nums.length; i++){
            prefLcm[i]=lcm(prefLcm[i-1], nums[i]);
            prefGcd[i]=gcd(prefGcd[i-1], nums[i]);
        }

        for(int j=nums.length-2; j>=0; j--){
            suffLcm[j]=lcm(suffLcm[j+1], nums[j]);
            suffGcd[j]=gcd(suffGcd[j+1], nums[j]);
        }
        result=prefLcm[nums.length-1]*prefGcd[nums.length-1];
        result=Math.max(result, suffLcm[1]*suffGcd[1]);
        result=Math.max(result, prefLcm[nums.length-2]*prefGcd[nums.length-2]);

        for(int i=1; i<nums.length-1; i++){
            long newGcd=gcd(prefGcd[i-1], suffGcd[i+1]);
            long newLcm=lcm(prefLcm[i-1], suffLcm[i+1]);
            result=Math.max(result, newGcd*newLcm);
        }
        return result;
        
    }
}