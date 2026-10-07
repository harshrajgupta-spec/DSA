class Solution {
    public String largestNumber(int[] nums) {
        int n=nums.length;
        for(int i=0; i<nums.length-1; i++){
            for(int j=0; j<n-i-1; j++){
                String s=nums[j]+""+nums[j+1];
                String ss=nums[j+1]+""+nums[j];
                if(ss.compareTo(s)>0){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        if(nums[0]==0){
            return "0";
        }
        String str="";
        for(int j=0; j<nums.length; j++){ 
            str+=nums[j];
        }
        return str;
    }
}