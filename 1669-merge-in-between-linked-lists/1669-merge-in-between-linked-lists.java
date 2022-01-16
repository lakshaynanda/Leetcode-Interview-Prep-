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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list2;
        ListNode l1 = list1;
        ListNode l2 = list1;
        
        for(int i = 0; i < a - 1; i++) {
            l1 = l1.next;
        }
        for(int i = 0; i <= b; i++) {
            l2 = l2.next;
        }
        while (temp.next != null) {
            temp = temp.next;
        }
        
        l1.next = list2;
        temp.next = l2;
        return list1;
    }
}