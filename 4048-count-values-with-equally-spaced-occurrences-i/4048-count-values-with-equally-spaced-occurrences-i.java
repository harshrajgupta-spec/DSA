class Solution {
    public int countSpecialIntegers(int[] nums) {
        Map<Integer, List<Integer>> map=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                if(map.get(nums[i]).size()>3){
                    continue;
                }
            }
            if(!map.containsKey(nums[i])){
                map.put(nums[i], new ArrayList<>());
                map.get(nums[i]).add(i);
            }
            else{
               map.get(nums[i]).add(i);
            }
        }
        int count=0;
        for(int key: map.keySet()){
            List<Integer> l=map.get(key);
            if(l.size()!=3)continue;
            if(l.get(2)-l.get(1)==l.get(1)-l.get(0)){
                count++;
            }
        }
        return count;
    }
}