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
    public ListNode reverseList(ListNode head) {
        ListNode prev = null; // A pointer to store reverse linkekd list
        ListNode next = null; // A pointer two iteratae in linked list.
        ListNode curr = head; 

        while(curr != null){
            next = curr.next; // Assign 2 as next.
            curr.next = prev; // 1-> Null.
            prev = curr; // Prev points to 1->Null
            curr = next; // Move curr ahead, that is now curr is pointing at 2.
        }
        head = prev; // The previous is pointing at 5. Assign prev to head.
        return head;
    }
}