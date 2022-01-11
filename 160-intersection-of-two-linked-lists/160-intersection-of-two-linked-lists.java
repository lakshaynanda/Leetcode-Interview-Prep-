/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while(headA != null) {
            ListNode pb = headB;
            while (pb != null) {
                if (headA == pb) {
                    return headA;
                }
                pb = pb.next;
            }
            headA = headA.next;
        }
        return null;
    }
}