// Approach
// (Floyd’s Cycle Detection)
// Use two pointers slow and fast, both starting at head.
// Move slow one step and fast two steps at a time.
// If slow and fast meet, a cycle exists in the linked list.
// Reset slow to head while keeping fast at the meeting point.
// Move both pointers one step at a time.
// The node where they meet again is the starting node of the cycle.
// If fast or fast.next becomes null, no cycle exists → return null
// time : O(n)
// space: O(1)


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
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow; 
            }
        }
        return null;
    }
}