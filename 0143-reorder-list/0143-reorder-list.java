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
import java.util.Deque;
import java.util.LinkedList;

class Solution {
    public void reorderList(ListNode head) {
        ListNode curr = head;                    // Initialize curr to traverse to the middle of the list
        ListNode temp = head.next;                // Initialize temp for faster traversal to reach the end
        Deque<ListNode> stack = new LinkedList<>(); // Stack to store the second half of the list in reverse order

        
        while (temp != null && temp.next != null) { // Traverse to the middle of the list
            curr = curr.next;                     
            temp = temp.next.next;              
        }

        temp = curr.next; // Set temp to the start of the second half
        curr.next = null; // Split the list into two halves

     
        while (temp != null) {  // Traverse the second half of the list
            stack.push(temp);   // Push nodes onto the stack
            temp = temp.next;   // Move to the next node
        }

        curr = head;                             

        
        while (!stack.isEmpty()) {
            curr = curr.next; // Move curr to the next node in the first half
            head.next = stack.pop(); // Link the next node in the first half to the top node from the stack
            head = head.next; // Move head to the next node (from the stack)
            head.next = curr; // Link the next node in the reordered list to curr
            head = head.next; // Move head forward
        }
    }
}
