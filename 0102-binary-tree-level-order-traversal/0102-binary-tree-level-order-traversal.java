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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list=new ArrayList<>();
        if(root==null)return list;
        Queue<TreeNode> node=new LinkedList<>(); 
        Queue<Integer> levels=new LinkedList<>();
        List<Integer> l=new ArrayList<>();
        int count=1;
        node.offer(root);
        levels.offer(count);
        while(!node.isEmpty()){
            TreeNode temp=node.poll();
            int level=levels.poll();
            if(level==count){
                l.add(temp.val); 
            }
            else{
                list.add(l);
                l=new ArrayList<>();
                l.add(temp.val);
                count++;
            }
            if(temp.left!=null){
                node.offer(temp.left);
                levels.offer(count+1);
            }
            if(temp.right!=null){
                node.offer(temp.right);
                levels.offer(count+1);
            }
        }
        list.add(l);
        return list;
    }
    // 3 9 20 15 7
    // 1 2 2  3  3
}   // 1 1