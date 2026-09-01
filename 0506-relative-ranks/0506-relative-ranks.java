class Solution {
    public String[] findRelativeRanks(int[] score) {
        String[] s=new String[score.length];
        int[] arr=new int[score.length];
        for(int i=0; i<score.length; i++){
            arr[i]=score[i];
        }
        Arrays.sort(arr);
        Map<Integer, String> map=new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(i==arr.length-1){
               map.put(arr[arr.length-1], "Gold Medal");
            }
            else if(i==arr.length-2){
                map.put(arr[arr.length-2], "Silver Medal"); 
            }
            else if(i==arr.length-3){
                map.put(arr[arr.length-3], "Bronze Medal");
            }
            else{
                map.put(arr[i], String.valueOf(arr.length-i));
            }
        }
        for(int i=0; i<arr.length; i++){
            s[i]=map.get(score[i]);
        }
        return s;
    }
}