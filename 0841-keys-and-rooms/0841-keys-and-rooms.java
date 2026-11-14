class Solution {
    public void bfs(int start, boolean[] visited, List<List<Integer>> rooms){
        Queue<Integer> q=new LinkedList<>();
        q.offer(0);
        while(q.size()>0){
            int front=q.poll();
            for(int ele:rooms.get(front)){
                if(!visited[ele]){
                    visited[ele]=true;
                    q.offer(ele);
                }
            }
        }

    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited=new boolean[rooms.size()]; 
        visited[0]=true;
        bfs(0, visited, rooms);
        for(boolean b:visited){
            if(!b)return false;
        }
        return true;
    }
}