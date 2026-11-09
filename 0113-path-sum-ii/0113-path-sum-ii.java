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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
          List<List<Integer>> list=new ArrayList<>();
          Stack<TreeNode> st=new Stack<>();
          Stack<List<Integer>> pathStack=new Stack<>();
          Stack<Integer> sumStack=new Stack<>();
          if(root==null)return list;
          List<Integer> p=new ArrayList<>();
          p.add(root.val);
          st.push(root);
          pathStack.push(p);
          sumStack.push(root.val);

          while(!st.isEmpty()){
             List<Integer> path=pathStack.pop();
             TreeNode temp=st.pop();
             int sum=sumStack.pop();

             if(sum==targetSum && temp.left==null && temp.right==null){
                   list.add(path);
             }

             if(temp.right!=null){
                List<Integer> curr=new ArrayList<>(path);
                curr.add(temp.right.val);
                pathStack.push(curr);
                st.push(temp.right);
                sumStack.push(sum+temp.right.val);
             }

             if(temp.left!=null){
                List<Integer> curr=new ArrayList<>(path);
                curr.add(temp.left.val);
                pathStack.push(curr);
                st.push(temp.left);
                sumStack.push(sum+temp.left.val);
             }
          }
          return list;
    }
}