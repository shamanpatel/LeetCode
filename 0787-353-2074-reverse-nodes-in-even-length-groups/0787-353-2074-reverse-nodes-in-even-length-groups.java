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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode dummy = head, cur = head, tail = null;
        int group = 0;
        while (cur != null) {
            group++;
            int len = 0;
            while (len < group && cur != null) {
                cur = cur.next;
                len++;
            }
            ListNode prev = null;
            cur = head;
            if (len % 2 == 0) {
                while (len > 0) {
                    ListNode next = cur.next;
                    cur.next = prev;
                    prev = cur;
                    cur = next;
                    len--;
                }
                if (tail != null) {
                    tail.next = prev;
                }
                tail = head;
            } else {
                while (len > 0) {
                    prev = cur;
                    cur = cur.next;
                    len--;
                }
                if (tail != null) {
                    tail.next = head;
                }
                tail = prev;
            }
            head = cur;
        }
        return dummy;
    }
}