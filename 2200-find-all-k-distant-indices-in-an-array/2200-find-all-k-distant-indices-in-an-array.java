class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
           List<Integer> list=new ArrayList<>();
           Set<Integer> set=new HashSet<>();

           for(int i=0; i<nums.length; i++){
               if(nums[i]==key){
                  set.add(i);
               }
           }

           for(int j=0; j<nums.length; j++){
               for(int idx:set){
                   if(Math.abs(idx-j)<=k){
                      list.add(j);
                      break;
                   }
               }
           }
           Collections.sort(list);
           return list;
    }
}