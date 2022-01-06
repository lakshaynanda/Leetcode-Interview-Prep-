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
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) {
            return head;
        }
        
        ListNode nextH = head;
        int count = 0;
        while (nextH != null && count < k) {
            count++;
            nextH = nextH.next;
        }
        
        if (count < k) {
            return head;
        }
        nextH = reverseKGroup(nextH, k);
        ListNode curr = head;
        ListNode pre = nextH;
        
        for (int i = 0; i < k; i++) {
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        return pre;
    }
}