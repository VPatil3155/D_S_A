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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null){
            return null;
        }
       ListNode curr=head;
       ListNode perv=head;
       ListNode cut=head;
       int length=0;
        while(curr != null ){
            perv=curr;
            curr = curr.next;
            length++;
        }
        perv.next=head;
        k = k % length;

        int n=length-k;

        for(int i=0;i<n-1;i++){
            cut=cut.next;
        }
        head=cut.next;
        cut.next=null;
        return head;
    }
}