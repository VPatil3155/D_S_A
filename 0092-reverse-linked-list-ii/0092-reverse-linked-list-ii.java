class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode before = dummy;

        // Move before to the node before left
        for (int i = 1; i < left; i++) {
            before = before.next;
        }

        ListNode curr = before.next;
        ListNode prev = null;

        // Reverse right-left+1 nodes
        int n = right - left + 1;

        for (int i = 0; i < n; i++) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Reconnect the reversed portion
        before.next.next = curr;
        before.next = prev;

        return dummy.next;
    }
}