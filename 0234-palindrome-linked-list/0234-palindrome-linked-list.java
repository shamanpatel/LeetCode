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
    public boolean isPalindrome(ListNode head) {  //Using Stack Approach
        Stack<Integer> palindrome = new Stack<>(); //Implemented stack to store the values of node
        ListNode fast = head; 
        ListNode curr = head;

        while(fast != null && fast.next != null){ // Using two pointers
            palindrome.push(curr.val); //Push the value of curr node in stack until the fast pointer reaches null.
            curr = curr.next;
            fast = fast.next.next;
        }
        if(fast != null){
            curr = curr.next;
        }
        while(!palindrome.isEmpty()){  // If stack is not empty
            int top = palindrome.pop(); // Store the popped element to top.
            if(curr.val != top){ // If the curr node value doesn't match the top return false.
                return false;
            }
            curr = curr.next; // Move curr pointer to next node.
        }
        return true;
    }
}