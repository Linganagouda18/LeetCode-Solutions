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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;
        Queue<TreeNode> que = new LinkedList<>();
        que.add(root);
        
        while (!que.isEmpty()) {
            int size = que.size();
            TreeNode lastNode = null;  

            for (int i = 0; i < size; i++) {
                TreeNode node = que.poll();
                lastNode = node; 

                if (node.left != null) que.add(node.left);
                if (node.right != null) que.add(node.right);
            }

            result.add(lastNode.val);
        }

        return result;        
    }
}