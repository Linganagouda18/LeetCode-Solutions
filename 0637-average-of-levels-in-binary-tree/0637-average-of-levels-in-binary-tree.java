class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null); // level delimiter

        long sum = 0;
        int count = 0;

        while (!q.isEmpty()) {
            TreeNode curr = q.poll();

            if (curr == null) {
                // End of level
                ans.add((double) sum / count);
                sum = 0;
                count = 0;

                if (!q.isEmpty()) {
                    q.add(null); // delimiter for next level
                }
            } else {
                sum += curr.val;
                count++;

                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
        }

        return ans;
    }
}
