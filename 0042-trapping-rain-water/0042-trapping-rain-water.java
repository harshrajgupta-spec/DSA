class Solution {
    public int trap(int[] height) {
        int i=0;
        int j=height.length-1;
        int water=0;
        int left=0;
        int right=0;
        while(i<j){
            left=Math.max(left, height[i]);
            right=Math.max(right, height[j]);
            int unit=Math.min(left, right);
            if(left<right){
                 water+=left-height[i];
                 i++;
            }
            else{
                water+=right-height[j];
                j--;
            }
        }
        return water;


        // int[] left=new int[height.length];
        // int[] right=new int[height.length];
        // left[0]=height[0];
        // right[height.length-1]=height[height.length-1];

        // for(int i=1; i<height.length; i++){
        //     left[i]=Math.max(left[i-1], height[i]);
        // }
        // for(int j=height.length-2; j>=0; j--){
        //     right[j]=Math.max(right[j+1], height[j]);
        // }
        // int water=0;
        // for(int i=0; i<height.length; i++){
        //     water+=(Math.min(left[i], right[i])-height[i]);
        // }
        // return water;
    }
}