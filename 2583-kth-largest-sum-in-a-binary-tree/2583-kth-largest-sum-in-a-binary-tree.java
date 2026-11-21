/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void bfs(List<Long> list, TreeNode root){
          Queue<TreeNode> q=new LinkedList<>();
          q.offer(root);
          while(q.size()>0){
             int size=q.size();
             long sum=0;
             for(int i=0; i<size; i++){
                 TreeNode temp=q.poll();
                 sum+=temp.val;
                 if(temp.left!=null){
                    q.offer(temp.left);
                 }
                 if(temp.right!=null){
                    q.offer(temp.right);
                 }
             }
             list.add(sum);
          }
    }
    public long kthLargestLevelSum(TreeNode root, int k) {
        List<Long> list=new ArrayList<>();
        bfs(list, root);
        Collections.sort(list);
        if(list.size()<k){
            return -1;
        }
        return list.get(list.size()-k);
    }
}