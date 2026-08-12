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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        ListNode dummy = lists[0];

        for (int i = 1; i < lists.length; i++) {
            dummy= mergeNodes(dummy, lists[i]);
        }
        return dummy;
        
    }
    ListNode mergeNodes(ListNode head, ListNode tobeMerge) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
       
        while (head != null && tobeMerge != null ){
            if (head.val <= tobeMerge.val) {
                current.next = head;
                head = head.next;
            }else {
                current.next = tobeMerge;
                tobeMerge = tobeMerge.next;
            }
            current = current.next;
        }
        current.next = (head != null) ? head : tobeMerge;
        return dummy.next;
    }
}
