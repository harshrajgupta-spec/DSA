class Solution {
    public int longestConsecutive(int[] nums) {
        
        Set<Integer> set=new HashSet<>();
        int max=0;
        for(int num:nums){
            set.add(num);
        }
        for(int num:set){
            int len=0;
            int count=num;
           if(set.contains(count-1))continue;
            while(set.contains(count)){
                 count++;
                 len++;
            }
            max=Math.max(max, len);
        }
        return max;
    }
}