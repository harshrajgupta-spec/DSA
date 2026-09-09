class Solution {
    public long pickGifts(int[] gifts, int k) {
        long sum=0;
        while(k>0){
            Arrays.sort(gifts);
            gifts[gifts.length-1]=(int)Math.floor(Math.sqrt(gifts[gifts.length-1]));
            k--;
        }
        for(int gift:gifts){
            sum+=gift; 
        }
        return sum;
    }
}