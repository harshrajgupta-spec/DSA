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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        Deque<TreeNode> dq=new LinkedList<>();
        if(root == null) return list;
        dq.offer(root);
       
        while(dq.size()>0){
            int size=dq.size();
            for(int i=0; i<size; i++){
                TreeNode temp=dq.poll();
                if(i == size - 1) {
                    list.add(temp.val);
                }
                if(temp.left!=null){
                    dq.offer(temp.left);
                }
                if(temp.right!=null){
                    dq.offer(temp.right);
                }
            }
            
        }
        return list;
    }
}