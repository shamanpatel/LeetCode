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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newlist = new ListNode(); // Create a dummy node
        ListNode curr = newlist; // Pointer to iterate through the new list
        
        // Iterate through both lists until one becomes null
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }
        
        // Append the remaining nodes from either list
        if (list1 != null) {
            curr.next = list1;
        } else {
            curr.next = list2;
        }
        
        return newlist.next; // Return the merged list (skipping the dummy node)
    }
}