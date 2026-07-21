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
    public void reorderList(ListNode head) {
        ListNode current = head.next;
        ListNode reversed = new ListNode();
        ListNode catched = head.next;
        int lengthList = 0;
        boolean odd = true;
         // creat reversed
        while (current != null) {
            reversed = new ListNode(current.val, reversed);   
            current = current.next;
            lengthList++; 
        }

        if (current == null) current = head;
        // fix head becomes 
        while (lengthList > 0) {
            //take reversed
            if (odd) {
                current.next = reversed;
                reversed = reversed.next;
                lengthList--;
                odd = false;
            }
            //take original
            else {
                current.next = catched;
                catched = catched.next;
                lengthList--;
                odd = true;
            }
            current = current.next;
        }
        if (current.next != null) current.next = null;
        }
    }
    

