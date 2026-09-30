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
    int ans = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return ans;
    }
    public int height(TreeNode p){
        if(p == null){
            return 0;
        }
        int leftHeight = height(p.left);
        int rightHeight = height(p.right);
        ans = Math.max(ans, leftHeight + rightHeight);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
