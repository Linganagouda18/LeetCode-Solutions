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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode>q = new LinkedList<>();
        int res = 0;
        int level = 0;
        int maxi =Integer.MIN_VALUE;

        q.add(root);


        while(!q.isEmpty()){
            int n = q.size();
            int sum = 0;
            level++;

            for(int i=0;i<n;i++){
                TreeNode curr = q.remove();

                sum += curr.val;

                if(curr.left != null ) q.add(curr.left);
                if(curr.right != null) q.add(curr.right); 
            }

            if(sum > maxi){
                maxi = sum;
                res = level;
                
            }
        }
        return res;
    }
}