class Solution {
    public void reorderList(ListNode head) {

        if (head == null || head.next == null) return;

        ListNode slow = head;
        ListNode fast = head;
    
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

    
        ListNode prev = null;
        ListNode curr = slow.next;
        slow.next = null; 
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;         
            prev = curr;              
            curr = temp;              
        }

        ListNode p1 = head;
        ListNode p2 = prev;

        while (p2 != null) {
       
            ListNode temp1 = p1.next;
            ListNode temp2 = p2.next;

            p1.next = p2;
            p2.next = temp1;

            p1 = temp1;
            p2 = temp2;
        }
    }
}