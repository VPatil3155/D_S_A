class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode before = dummy;

        for(int i=1;i<left;i++){
            before= before.next;
        }
        ListNode curr = before.next;
        ListNode perv = null;

        int n= right-left+1;
        for(int i=0;i<n;i++){
            ListNode next = curr.next;
            curr.next=perv;
            perv=curr;
            curr=next;
        }

        before.next.next=curr;
        before.next=perv;
        
        return dummy.next;
    }
}