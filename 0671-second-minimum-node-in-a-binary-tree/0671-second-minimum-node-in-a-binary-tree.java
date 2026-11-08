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
    public int findSecondMinimumValue(TreeNode root) {
        Stack<TreeNode> st=new Stack<>();
        long first=Long.MAX_VALUE;
        long second=Long.MAX_VALUE;
        st.push(root);

        while(!st.isEmpty()){
            TreeNode temp=st.pop();
            if(temp.val<first) {
                second=first;
                first=temp.val;
            }
            else if(temp.val>first && temp.val<second) {
                second=temp.val;
            }
            if(temp.right!=null){
                st.push(temp.right);
            }
            if(temp.left!=null){
                st.push(temp.left);
            }
        }
        if(second==Long.MAX_VALUE){
            return -1;
        }
        return (int)second;
    }
}