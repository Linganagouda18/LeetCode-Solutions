class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new  ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;
        ListNode temp1 = head;
        HashSet<Integer> set = new HashSet<>();

        while (temp1 != null) {  // Check until temp1 is not null, no need for temp1.next != null
            if (temp1.next != null && temp1.val == temp1.next.val) {  // Detect if the next value is the same
                set.add(temp1.val);  // Add the current value to set (because it’s a duplicate)
                temp1 = temp1.next;  // Skip over the duplicate value
            } else {
                if (!set.contains(temp1.val)) {  // If the current value is not in set (not a duplicate)
                    temp.next = temp1;  // Link the non-duplicate node
                    temp = temp.next;  // Move the temp pointer
                }
                temp1 = temp1.next;  // Move to the next node in the list
            }
        }
        
        temp.next = null;  // Ensure the last node points to null
        return dummy.next;  // Return the modified list
    }
}
