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
        HashSet<ListNode> set = new HashSet<>();  // Created a HashSet to store the values.
        while(head != null){ 
            if(set.contains(head)){ // If the value is in HashSet.
                return true;
            }
            set.add(head); // Add the value in the HashSet.
            head = head.next; // Move the pointer
        }
        return false; 
    }
}