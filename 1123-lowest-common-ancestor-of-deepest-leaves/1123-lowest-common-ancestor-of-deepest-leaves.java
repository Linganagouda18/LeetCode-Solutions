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
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        int maxi = maxheight(root);
        return dfs(root,maxi,0);   
    }

    private TreeNode dfs(TreeNode root , int maxi , int len){
        if(root == null)return null;
        if(maxi -1 == len)return root;

        TreeNode l = dfs(root.left,maxi,len+1);
        TreeNode r = dfs(root.right,maxi,len+1);

        if(l != null && r != null)return root;
        return l != null ? l : r;
    }

    public int maxheight(TreeNode root){
        if(root == null)return 0;

        int l = maxheight(root.left);
        int r = maxheight(root.right);
        return Math.max(l,r)+1;
    }

}