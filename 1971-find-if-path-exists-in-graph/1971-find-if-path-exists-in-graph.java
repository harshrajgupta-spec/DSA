class Solution {
    public void bfs(int start, List<List<Integer>> list, boolean[] visited){
        Queue<Integer> q=new LinkedList<>();
        q.offer(start);
        while(q.size()>0){
            int front=q.poll();
            for(int ele:list.get(front)){
                if(!visited[ele]){
                   visited[ele]=true;
                   q.offer(ele);
                }
            }
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source==destination)return true;
        boolean[] visited=new boolean[n];
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0; i<n; i++){
            list.add(new ArrayList<>());
        }
        for(int i=0; i<edges.length; i++){
            list.get(edges[i][0]).add(edges[i][1]);
            list.get(edges[i][1]).add(edges[i][0]);
        }
        bfs(source, list, visited);
        return visited[destination];
    }
}