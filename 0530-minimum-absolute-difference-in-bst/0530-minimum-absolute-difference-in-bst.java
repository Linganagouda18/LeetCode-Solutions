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
    int mini = Integer.MAX_VALUE;
    TreeNode prev = null;

    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return mini;
        
    }

    public void inorder(TreeNode root){
        if(root == null)return;

        inorder(root.left);
        if(prev != null) mini = Math.min(mini , Math.abs(root.val-prev.val));
        prev = root;
        // if(root.right != null) mini = Math.min(mini , Math.abs(root.right.val - root.val));
        inorder(root.right);
    }
}