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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);

        while(!que.isEmpty()){
            int start = que.size();
            double avg = 0.0;

            for(int i=0; i<start; i++){
                TreeNode curr = que.poll();
                avg+=curr.val;

            if(curr.left != null){
                que.offer(curr.left);
            }
            if(curr.right != null){
                que.offer(curr.right);
            }
        }
        avg/=(double)start;
            res.add(avg);
        }
        return res;
    }
}