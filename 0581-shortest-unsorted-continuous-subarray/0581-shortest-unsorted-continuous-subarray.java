class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0; i<nums.length; i++){
            arr[i]=nums[i];
        }
        Arrays.sort(arr);
        int start=nums.length;
        int end=0;
        for(int i=0; i<nums.length; i++){
            if(arr[i]!=nums[i]){
                start=Math.min(start, i);
                end=Math.max(end, i);
            }
        }
        if(start==nums.length && end==0){
            return 0;
        }
        return end-start+1;
    }
}