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

// Approach
// We iterate through the linked list while reversing the direction of each node’s `next` pointer.
// At every step, we first save the next node to avoid losing the remaining list, then point the current node’s `next` to the previous node.
// After reversing the link, we move the `prev` pointer to the current node and advance the `curr` pointer to the saved next node.
// We continue this process until `curr` becomes `null`.
// Finally, `prev` points to the new head of the reversed list and is returned.
// time complexity: O(n)
// space complexity: O(1)

class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode next = curr.next;  //save the next connection
            curr.next = prev;  //reverse
            prev = curr;  //shift pointer of from previous node to current node
            curr = next;  //shift pointer from current node to next node that is to be reversed

        }
    return prev;
    }
}