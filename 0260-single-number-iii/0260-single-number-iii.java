class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0;
        for(int num:nums){
            xor^=num;
        }
        int group1=0;
        int group2=0;
        int mask = xor & -xor;
        for(int num:nums){
            if((num & mask)!=0){ 
                group1^=num;
            }
            else{
                group2^=num;
            }
        }
       
        return new int[]{group1, group2};
    }
}