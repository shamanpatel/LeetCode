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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode newHead = new ListNode(0);  // dummy node
        newHead.next = head;
        ListNode temp = newHead;
        
        while (temp != null) {
            if (temp.next != null && temp.next.next != null && temp.next.val == temp.next.next.val) {
                ListNode nxt = temp.next.next;
                while (nxt != null && nxt.next != null && nxt.val == nxt.next.val) {
                    nxt = nxt.next;
                }
                temp.next = nxt.next;  // skip all duplicates
            } else {
                temp = temp.next;  // move to the next node
            }
        }
        return newHead.next;
    }
}