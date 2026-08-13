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

        //creat a current node
        // let l1 and l2 add each other and add the result to current node
        ListNode dummy = new ListNode(0);
        ListNode current = new ListNode(0);
        dummy.next = current;

        while (l1 != null && l2 != null) {
            int finalValue = l1.val + l2.val;
            if (finalValue >= 10) {
                ListNode newListNode = new ListNode(1);
                ListNode secondListNode = new ListNode(finalValue - 10);
                secondListNode.next = newListNode;
                current.next = secondListNode;
                current = current.next;
            }else {
                ListNode newListNode = new ListNode(finalValue);
                current.next = newListNode;
            }
            
            current = current.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 != null) {current.next = l1;}
        if (l2 != null) {current.next = l2;}
        return dummy.next.next;

        
    }
}
