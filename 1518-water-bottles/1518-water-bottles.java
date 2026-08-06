class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
         int bottle=numBottles;
         int exchange=numExchange;
         int num=0;
         while(bottle>=exchange){
             num=num+(bottle/exchange);
             bottle=(bottle%exchange)+(bottle/exchange);
         }
         return num+numBottles;
    }
}