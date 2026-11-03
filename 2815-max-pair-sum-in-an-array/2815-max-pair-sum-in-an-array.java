class Solution {
    public int maxSum(int[] nums) {
        Map<Integer, Integer> map=new HashMap<>();
        int sum=-1;
        for(int i=0; i<nums.length; i++){
            int n=nums[i];
            int max=0;
            while(n>0){
                int d=n%10;
                max=Math.max(max, d);
                n/=10;
            }
            if(map.containsKey(max)){
                sum=Math.max(sum, nums[i]+map.get(max));
                map.put(max, Math.max(nums[i], map.get(max)));
            }
            else{
                map.put(max, nums[i]);
            }
        }
        return sum;
    }
}