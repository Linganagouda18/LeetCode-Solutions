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
    public TreeNode reverseOddLevels(TreeNode root) {
        helper(root.left , root.right , 1);
        return root;
    }

    private void helper(TreeNode rootl , TreeNode rootr , int level){
        if(rootl == null ||  rootr == null){
            return;
        }

        if(level % 2 ==1){
           int temp = rootl.val;
           rootl.val = rootr.val;
           rootr.val = temp;
        }

        helper(rootl.left , rootr.right , level+1);
        helper(rootl.right , rootr.left , level+1);
    }
}