class Solution {
    public boolean hours(int[] piles, int hour, int h){
        long totalHours=0;
        for(int pile:piles){
            totalHours+=(int)Math.ceil((double)pile/hour);
        }
        return totalHours<=h;
    }
    public int minEatingSpeed(int[] piles, int h) {
           int max=0;
           for(int pile:piles){
             max=Math.max(pile, max);
           }
           int low=1;
           int high=max;
           while(low<high){
               int mid=low+(high-low)/2;
               if(hours(piles, mid, h)){
                   high=mid;
               }
               else{
                 low=mid+1;
               }
           }
           return low;
    }
}