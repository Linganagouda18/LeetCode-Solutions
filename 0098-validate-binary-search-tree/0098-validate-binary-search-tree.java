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
    public boolean isValidBST(TreeNode root) {
        return isvalid(root , Long.MIN_VALUE , Long.MAX_VALUE);
        
    }

    private boolean isvalid(TreeNode root, long min,long max){
        //base case 
        if(root == null)return true;

        if( root.val <= min)return false;
        else if( root.val >= max)return false;

        return isvalid(root.left , min , root.val) && isvalid(root.right , root.val , max);
    }
}