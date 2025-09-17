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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode>q = new LinkedList<>();
       if (root != null) {
            q.add(root);
        }
        int a = 0;

        while(!q.isEmpty()){
            int n = q.size();

            List<Integer>res = new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode curr = q.remove();
                res.add(curr.val);
                
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            if(a %2 == 1){
              Collections.reverse(res);
               ans.add(res);
             } else{ 
            ans.add(res);
             }
            a++;
        }
        return ans;
        
    }
}