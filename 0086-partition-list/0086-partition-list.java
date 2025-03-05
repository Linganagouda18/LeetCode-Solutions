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
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummy = new ListNode();
        ListNode res = dummy;
        ListNode temp1 = head;

        while(temp1 != null){
            if(temp1.val < x){
                dummy.next = new ListNode(temp1.val);
                dummy = dummy.next;
            }

            temp1 = temp1.next;
        }

        ListNode temp = head;
        while(temp != null){
            if(temp.val >=x){
                dummy.next = new ListNode(temp.val);
                dummy = dummy.next;
            }

            temp = temp.next;
        }

        return res.next;
        
    }
}