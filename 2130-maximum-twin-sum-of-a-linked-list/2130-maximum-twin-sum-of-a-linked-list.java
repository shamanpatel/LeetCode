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
    public int pairSum(ListNode head) {
        ListNode prev = null;  
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null){  // Itetare till the middle of Linkedlist and find the middle element
            fast = fast.next.next;
            ListNode next = slow.next; // Reverse the list before middle node.
            slow.next = prev;
            prev = slow;
            slow = next;
        }
        int result = 0;
        while(prev != null){
            result = Math.max(result, prev.val + slow.val); // Prev pointing at head and slow at middle.next node. 
            prev = prev.next;
            slow = slow.next;
        }
        return result;  // Add both the values and return the max value everytime the pointer moves ahead.
    }
}