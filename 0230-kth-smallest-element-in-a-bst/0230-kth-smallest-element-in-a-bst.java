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
    public int kthSmallest(TreeNode root, int k) {
        Stack<Integer> visited=new Stack<>();
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        visited.push(0);
        int count=0;
        while(!st.isEmpty()){
            TreeNode temp=st.pop();
            int visit=visited.pop();
            if(visit==1){
                count++;
                if(count==k){
                    return temp.val;
                }
                continue;
            }
            else{
                if(temp.right!=null){
                    st.push(temp.right);
                    visited.push(0);
                }
                st.push(temp);
                visited.push(1);
                if(temp.left!=null){
                    st.push(temp.left);
                    visited.push(0);
                }
            }
        }
        return 0;
    }
}