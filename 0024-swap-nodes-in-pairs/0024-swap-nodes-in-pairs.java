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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode  current=head;
        ListNode perv=dummy;
        while(current != null && current.next != null){
            ListNode first = current;
            ListNode second = current.next;
            ListNode nextPair = second.next;

            perv.next = second;
            second.next = first;
            first.next = nextPair;

            perv = first;
            current = first.next; 
        }
        return dummy.next;
    }
}