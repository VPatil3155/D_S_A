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
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode current =  head;
        
        while(current != null){
           
           ListNode search = dummy;
           ListNode unsorted = current.next;
           while(search.next != null && search.next.val < current.val){
            search=search.next;
           }

            current.next=search.next;
            search.next=current;
            current = unsorted;
        }
        return dummy.next;
    }
}