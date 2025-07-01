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
    public TreeNode deleteNode(TreeNode root, int key) {
        
        return helper( root,  key);
    }

    private TreeNode helper(TreeNode root , int key){
        if(root == null)return null;

        if(root.val < key){
            root.right = helper(root.right , key);
        }else if(root.val > key){
            root.left = helper(root.left , key);
        }else{
            //case 1 : leaf node

            if(root.left == null && root.right == null){
                return null;
            }else if(root.right == null){
                return root.left;
            }else if(root.left == null){
                return root.right;
            }else{
                TreeNode Is = findinoder(root.right);
                root.val = Is.val;
               root.right =  helper(root.right , Is.val);
            }
        }

        return root;
    }

    public TreeNode findinoder(TreeNode root){
        while(root.left != null){
            root = root.left;
        }

        return root;
    }
}