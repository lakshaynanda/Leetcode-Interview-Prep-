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
        HashSet<ListNode> set = new HashSet<>();
        
        ListNode dummy = head;
        
        while(dummy != null) {
            if(set.contains(dummy)) {
                return true;
            }
            set.add(dummy);
            dummy = dummy.next;
        }
        return false;
    }
}