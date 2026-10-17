class Solution {
    public int countPairs(int[] deliciousness) {
        int mod=1000000007;
        Map<Integer, Integer> map=new HashMap<>();
        long res=0;
        for(int d:deliciousness){
            int power=1;
            for(int i=0; i<22; i++){
                if(map.containsKey(power-d)){
                    res+=map.get(power-d);
                    res%=mod;
                }
                power*=2;
            }
            map.put(d, map.getOrDefault(d, 0)+1);
        }
        return (int) res;

    }
}