class Solution {
    public int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b, a%b);
    }
    public int countBeautifulPairs(int[] nums) {
        int count=0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                String s=String.valueOf(nums[i]);
                String ss=String.valueOf(nums[j]);
                if(gcd(s.charAt(0)-'0', ss.charAt(ss.length()-1)-'0')==1){
                    count++;
                }
            }
        }
        return count;
    }
}