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
    public int bfs(TreeNode root){
        int level=0;
        int maxLevel=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int sum=Integer.MIN_VALUE;
        while(q.size()>0){
            level++;
            int size=q.size();
            int newSum=0;
            for(int i=0; i<size; i++){
                TreeNode temp=q.poll();
                newSum+=temp.val;
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
            }
            if(newSum>sum){
                maxLevel=level;
                sum=newSum;
            }
        }
        return maxLevel;
    }
    public int maxLevelSum(TreeNode root) {
        return bfs(root);
    }
}