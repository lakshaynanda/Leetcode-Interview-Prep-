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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode revL1 = reverseList(l1);
        ListNode revL2 = reverseList(l2);
        int carry = 0;
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        while(revL1 != null || revL2 != null) {
            int x = revL1 != null ? revL1.val : 0;
            int y = revL2 != null ? revL2.val : 0;
            
            int sum = x + y + carry;
            carry = sum / 10;
            // System.out.println("carry "+carry);
            // System.out.println("sum "+sum%10);
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            
            if(revL1 != null) {
                revL1 = revL1.next;
            }
            if(revL2 != null) {
                revL2 = revL2.next;
            }
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        ListNode ans = reverseList(dummy.next);
        return ans;

    }
    public ListNode reverseList(ListNode head) {
        ListNode last = null;
        while(head != null) {
            ListNode tmp = head.next;
            head.next = last;
            last = head;
            head = tmp;
        }
        return last;
    }
}