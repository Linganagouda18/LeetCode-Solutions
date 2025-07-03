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
    public boolean isBalanced(TreeNode root) {
        int count[] = new int[1];
         helper(root , count);
       return count[0] == 0;
    }

    private int helper(TreeNode root , int count[] ){
        if(root == null) return 0;

        int l = helper(root.left , count);
        int r = helper(root.right , count);

        if(Math.abs(l-r) > 1){
           count[0]++;
        }

        return Math.max(l,r)+1;
    }
}