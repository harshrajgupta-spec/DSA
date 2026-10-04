class Solution {
    public void wiggleSort(int[] nums) {
         int[] temp=new int[nums.length];
         for(int i=0; i<nums.length; i++){
            temp[i]=nums[i];
         }
         Arrays.sort(temp);
         int left=(temp.length-1)/2;
         int right=temp.length-1;
         for(int j=0; j<nums.length; j+=2){
             nums[j]=temp[left];
             left--;
         }
         for(int j=1; j<nums.length; j+=2){
             nums[j]=temp[right];
             right--;
         }
         
    }
}