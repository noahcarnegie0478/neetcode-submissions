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
        if (l1 == null && l2 == null) return null;
        if (l1 == null || l2 == null) return l1 == null ? l2 : l1;
        //int: holding
        int holdingNumber = 0;
        ListNode dummy = new ListNode(0);
        ListNode current = new ListNode(0);
        dummy.next = current;
        //listnode dummy
        //listnode current

        //loop and add
        while (l1 != null && l2 != null) {
            if (l1.next != null && l2.next == null) {
                l2.next = new ListNode(0);
            }else if (l1.next == null && l2.next != null) {
                l1.next = new ListNode(0);
            }
            int finalValue = l1.val + l2.val + holdingNumber;
            if (finalValue >=10) {
                holdingNumber = 1;
                finalValue = finalValue -10;
            }
            current.next = new ListNode(finalValue);
            current = current.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (holdingNumber > 0) current.next = new ListNode(1);
        return dummy.next.next;
        //if one of them is null, make the next one equal to 0, 
        //and put it to the next one


       

        
    }
}
