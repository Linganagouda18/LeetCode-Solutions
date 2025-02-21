/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode te = headA;
        ListNode temp = headA;
        ListNode temp1 = headB;
          ListNode tem = headB;
        int sz = 0;
        int sz1 = 0;
        while(temp != null){
            sz++;
            temp = temp.next;
        }

        while(temp1 != null){
            sz1++;
            temp1 = temp1.next;
        }

        if(sz > sz1){
            while(sz != sz1){
                te = te.next;
                sz--;

            }


        }else{
          

            while(sz != sz1){
                tem = tem.next;
                sz1--;
            }
        }

        while(te != null && tem != null){
            if(te == tem){
                return te;
            }

            te = te.next;
            tem = tem.next;
        }
        return null;
        
    }
}