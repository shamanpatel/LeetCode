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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null || head.next ==  null){
            return null;
        }
        ListNode slow = head; // Two pointers approach
        ListNode fast = head; // Find middle node 
        ListNode prev = null; // A pointer to track the previous node of the node to be delete.

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next; // The middle node
        }
        if(prev != null){
            prev.next = slow.next; 
        }
        return head;
    }
}