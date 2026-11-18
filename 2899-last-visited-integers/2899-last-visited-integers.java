class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        List<Integer> seen=new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        int k=0;
        for(int i=0; i<nums.length; i++){
            if(i>0){
                if(nums[i]!=-1){
                    seen.add(0, nums[i]);
                    k=0;
                }else{
                    k++;
                    if(seen.size()>=k){
                        ans.add(seen.get(k-1));
                    }
                    else{
                        ans.add(-1);
                    }
                }
            }else{
                if(nums[i]!=-1){
                    seen.add(0,nums[i]);
                    k=0;
                }else{
                    k++;
                    if(seen.size()>=k){
                        ans.add(seen.get(k-1));
                    }else{
                        ans.add(-1);
                    }
                }
            }
        }
        return ans;
    }
}