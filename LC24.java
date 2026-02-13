// Approach ()
// Use a dummy node before the head to simplify swapping when the first pair includes the head.
// Maintain two pointers:
// prev → points to the node before the current pair
// curr → points to the first node of the current pair
// Traverse the list while there are at least two nodes to swap.
// For each pair:
// Save the start of the next pair.
// Identify the second node of the current pair.
// Rewire three links to swap the pair:
// First node points to the next pair.
// Second node points to the first node.
// Previous node points to the second node.
// After swapping, move:
// prev to the tail of the swapped pair.
// curr to the start of the next pair.
// Return dummy.next, which points to the new head after all swaps.
// Time Complexity: O(n)
// Space Complexity: O(1)

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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;//prev->1
        ListNode curr = head;  //1
        while(curr!=null && curr.next != null){
            ListNode nextPair = curr.next.next;//3
            ListNode second = curr.next; //2

            //swap
            curr.next = nextPair; // 1->3
            second.next = curr; // 2->1
            prev.next = second; //prev->2
            //prev->2->1->3

            prev = curr;
            curr = nextPair;
            
        }
    return dummy.next;
    }
}