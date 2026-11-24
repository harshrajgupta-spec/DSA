class Solution {
    public int[] findOrder(int numCourses, int[][] pre) {
        List<List<Integer>> list=new ArrayList<>();
        int[] inDegree=new int[numCourses];
        for(int i=0; i<numCourses; i++){
            list.add(new ArrayList<>());
        }
        for(int[] arr:pre){
            list.get(arr[1]).add(arr[0]);
            inDegree[arr[0]]++;
        }
        List<Integer> orderList=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        for(int i=0; i<inDegree.length; i++){
            if(inDegree[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int node=q.poll();
            orderList.add(node);
            for(int n:list.get(node)){
                inDegree[n]--;
                if(inDegree[n]==0){
                    q.add(n);
                }
            }
        }
        if(numCourses>orderList.size()){
            return new int[0];
        }
        int[] courses=new int[numCourses];
        for(int i=0; i<numCourses; i++){
            courses[i]=orderList.get(i);
        }
        return courses;
    }
}