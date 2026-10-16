class Solution {
    public int countSpecialIntegers(int[] nums) {
        if(nums.length==1){
            return 1;
        }
       Map<Integer, List<Integer>> map=new HashMap<>();
       List<Integer> list=new ArrayList<>();
       for(int i=0; i<nums.length; i++){
           if(!map.containsKey(nums[i])){
               map.put(nums[i], new ArrayList<>());
               map.get(nums[i]).add(i);
           }
           else{
               map.get(nums[i]).add(i);
           }
       }
       int count=0;
       for(int key:map.keySet()){
           List<Integer> l=map.get(key);
           for(int i=1; i<l.size(); i++){
               if(l.get(i)-l.get(i-1)!=1){
                    count++;
                    break;
               }
           }
       }
        return map.size()-count;
    }
}