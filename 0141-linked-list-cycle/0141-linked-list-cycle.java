/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;  // Two Pointers
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next; 
            slow = slow.next;
            if(fast == slow){  // When two pointers point at same index then there is a cycle.
                return true;
            }
        }
        return false;
    }
}