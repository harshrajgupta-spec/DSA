class Solution {
    public int mostFrequent(int[] nums, int key) {
        Map<Integer, Integer> map=new HashMap<>();
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]==key){
                map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            }
        }
        int max=0;
        int val=0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
             int m=entry.getKey();
             int n=entry.getValue();
             if(n>max){
                val=m;
             }
             max=Math.max(max, n);
       }
       return val;
    }
}