class Solution {
    public boolean canFinish(int numCourses, int[][] pre) {
           List<List<Integer>> list=new ArrayList<>();
           for(int i=0; i<numCourses; i++){
              list.add(new ArrayList<>());
           }
           int[] inDegree=new int[numCourses];
           
           for(int[] l:pre){
              list.get(l[1]).add(l[0]);
              inDegree[l[0]]++;
           }

            Queue<Integer> q=new LinkedList<>();
            for(int i=0; i<numCourses; i++){
                if(inDegree[i]==0){
                    q.add(i);
                }
            }

            int count=0;
            while(!q.isEmpty()){
                int node=q.poll();
                count++;

               for(int next:list.get(node)){
                   inDegree[next]--;
                   if(inDegree[next]==0){
                      q.add(next);
                   }
               }
            }
            return count==numCourses;
    }
}