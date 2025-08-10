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

    public ListNode merge(ListNode l1 , ListNode l2){
        ListNode temp = new ListNode();
        ListNode l = temp;
        while(l1 != null && l2 !=null){

            if(l1.val < l2.val){
                l.next = l1;
                l1 = l1.next;
            }else{
                l.next = l2;
                l2 = l2.next;
            }
            l = l.next;
        }
        l.next = (l1 != null) ? l1 : l2;
        return temp.next;
    }
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;


        while(fast != null && fast.next != null){
            prev =slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;

      ListNode l1 =   sortList(head);
      ListNode l2 =  sortList(slow);

      return merge(l1 , l2); 
    }
}