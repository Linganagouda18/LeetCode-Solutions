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
     int maxi = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
         helper(root);
          return maxi;
    }

    public int helper(TreeNode root){
        if(root == null)return 0;

        int l = helper(root.left);
        int r = helper(root.right);
     maxi = Math.max(maxi, l + r + root.val);
       return root.val + Math.max(l, r);
    }
}