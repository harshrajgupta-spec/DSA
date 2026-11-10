class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
          List<List<Integer>> res=new ArrayList<>();
          List<Integer> list=new ArrayList<>();
          int[] freq=new int[201];

          for(int num:nums){
              freq[num]++;
          }
          int k=0;
          while(k<nums.length){
               for(int i=0; i<201; i++){
                  if(freq[i]>0){
                      list.add(i);
                      freq[i]--;
                      k++;
                  }
               }
               res.add(list);
               list=new ArrayList<>();
          }
          return res;
    }
}