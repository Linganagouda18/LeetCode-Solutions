/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {

        ListNode temp = head;
        List<Integer>ans = new ArrayList<>();
        int size = 0;

        while(temp != null){
            ans.add(temp.val);
            temp = temp.next;
        }


        
        return createbst(ans , 0,ans.size()-1);
    }

    private TreeNode createbst(List<Integer>ans , int st ,int  end){
        if(st > end)return null;

        int mid = (st + end) /2;

        TreeNode root = new TreeNode(ans.get(mid));
        root.left = createbst(ans,st,mid-1);
        root.right = createbst(ans,mid+1,end);
        return root;
    }
}