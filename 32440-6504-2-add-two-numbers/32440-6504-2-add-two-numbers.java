/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;             // Value of the current node
 *     ListNode next;       // Reference to the next node in the list
 *     ListNode() {}        // Default constructor
 *     ListNode(int val) { this.val = val; } // Constructor with a value
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; } // Constructor with a value and next node
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Create a dummy node to simplify the handling of the resulting list
        ListNode dummy = new ListNode(0);
        
        // Pointer to the current node in the resulting list
        ListNode current = dummy;

        // Variable to store the carry from the addition of two digits
        int carry = 0;

        // Continue looping as long as there are nodes in l1, l2, or there's a carry
        while (l1 != null || l2 != null || carry != 0) {
            int sum = 0; // Variable to store the sum of the current digits and carry

            // If l1 is not null, add its value to the sum and move to the next node
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            // If l2 is not null, add its value to the sum and move to the next node
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // Add the carry from the previous calculation
            sum += carry;

            // Calculate the new carry (e.g., for 15, carry is 1)
            carry = sum / 10;

            // Create a new node with the value of the current digit (e.g., for 15, the value is 5)
            ListNode node = new ListNode(sum % 10);

            // Append the new node to the resulting list
            current.next = node;

            // Move to the next node in the resulting list
            current = current.next;
        }

        // Return the head of the resulting list (skipping the dummy node)
        return dummy.next;
    }
}
