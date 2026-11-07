class Solution {
    public boolean isTrionic(int[] nums) {
        int p=1;
        int q=0;
        if(nums.length==3)return false;
        for(int i=1; i<nums.length; i++){
            if(nums[i]<=nums[i-1]){
                p=i;
                break;
            }
        }
        if(p==1)return false;
        for(int j=p; j<nums.length; j++){
            if(nums[j]>=nums[j-1]){
                q=j;
                break;
            }
        }
        if(q==0 || p==0)return false;
        for(int k=q; k<nums.length; k++){
            if(nums[k]<=nums[k-1]){
                return false;
            }
        }
        return true;
    }
}