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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Dummy head placeholder to avoid null pointer issues when starting
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        // Loop as long as there are nodes to process or a carry digit remains
        while (l1 != null || l2 != null || carry != 0) {
            // Extract values; use 0 if the list has run out of nodes
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            // Compute the current sum and updated carry
            int sum = val1 + val2 + carry;
            carry = sum / 10;

            // Append the digit to the result list
            current.next = new ListNode(sum % 10);
            current = current.next;

            // Move pointer forward in the input lists
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummyHead.next;
    }
}
