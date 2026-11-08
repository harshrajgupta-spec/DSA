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
    public int sumNumbers(TreeNode root) {
          int sum=0;
          Stack<TreeNode> st=new Stack<>();
          st.push(root);
          while(!st.isEmpty()){
              TreeNode temp=st.pop();
              if(temp.left==null && temp.right==null){
                   sum+=temp.val;
              }
              if(temp.right!=null){
                  temp.right.val+=temp.val*10;
                  st.push(temp.right);
              }
              if(temp.left!=null){
                  temp.left.val+=temp.val*10;
                  st.push(temp.left);
              }
          }
          return sum;
    }
}