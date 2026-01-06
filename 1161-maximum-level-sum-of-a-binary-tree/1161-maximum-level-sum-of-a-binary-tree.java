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
        q.add(root);
        int res = Integer.MIN_VALUE;
        int c = 0;
        int val =0;

        while(!q.isEmpty()){
            int n = q.size();
            int sum = 0;
            c++;

            for(int i=0;i<n;i++){
                TreeNode curr = q.remove();

                sum += curr.val;

                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }

            if(res < sum){
                res = sum;
                val = c;
            }
        }

        return val;
    }
}