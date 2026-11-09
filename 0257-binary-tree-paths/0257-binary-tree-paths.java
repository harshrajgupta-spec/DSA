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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list=new ArrayList<>();
        Stack<String> str=new Stack<>();
        Stack<TreeNode> st=new Stack<>();

        st.push(root);
        str.push("");

        while(!st.isEmpty()){
            TreeNode temp=st.pop();
            String s=str.pop();

            if(temp.left==null && temp.right==null){
                list.add(s+temp.val);
            }
            if(temp.left!=null){
                st.push(temp.left);
                str.push(s+temp.val+"->");
            }
            if(temp.right!=null){
                st.push(temp.right);
                str.push(s+temp.val+"->");
            }
        }
        return list;
    }
}