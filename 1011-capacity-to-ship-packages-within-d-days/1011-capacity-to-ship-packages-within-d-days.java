class Solution {
    public int isPossible(int[] arr, int capacity){
          int count=1;
          int n=0;
          for(int ele:arr){
              if(n+ele>capacity){
                 n=ele;
                 count++;
              }
              else{
                n+=ele;
              }
          }
          
          return count;
    }
    public int shipWithinDays(int[] weights, int days) {
        int sum=0;
        int max=-1;
        int ans=-1;
        for(int ele:weights){
            sum+=ele;
            max=Math.max(max, ele);
        }
        int low=max;
        int high=sum;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(isPossible(weights, mid)<=days){
                 ans=mid;
                 high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}