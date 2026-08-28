class Solution {
    public int getWinner(int[] arr, int k) {
        Queue<Integer> q=new LinkedList<>();
        int max=arr[0];
        for(int i=1; i<arr.length; i++){
            max=Math.max(max, arr[i]);
            q.offer(arr[i]);
        }
        int curr=arr[0];
        int streak=0;

        while(!q.isEmpty()){
            int opponent=q.poll();
            if(curr>opponent){
                q.offer(opponent);
                streak++;
            }
            else{
                q.offer(curr);
                curr=opponent;
                streak=1;
            }
            if(streak==k || curr==max){
                return curr;
            }
        }
        return -1;
    }
}