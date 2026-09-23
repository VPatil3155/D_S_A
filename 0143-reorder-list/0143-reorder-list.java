public class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
       
        ListNode curr = slow.next;
        slow.next = null; 
        
        ListNode prev = null;
        while (curr != null) {
            ListNode nxt = curr.next; 
            curr.next = prev;        
            prev = curr;             
            curr = nxt;             
        }
        
  
        ListNode first = head;       
        ListNode second = prev;     
        
        while (second != null) {
            
            ListNode tmp1 = first.next;
            ListNode tmp2 = second.next;
            
           
            first.next = second;
            
            second.next = tmp1;
            
            
            first = tmp1;
            second = tmp2;
        }
    }
}