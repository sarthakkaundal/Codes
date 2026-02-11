// Approach 
// Use a dummy node before head so deletion logic is uniform, even when the head node itself must be removed.
// Maintain two pointers:
// curr to traverse the list.
// prev to track the last node that is kept.
// Traverse the list:
// If curr.val == val, remove the node by linking prev.next to curr.next.
// Otherwise, keep the node and move prev forward.
// Always move curr forward.
// Return dummy.next, which represents the updated head.
// Time Complexity
// O(n) — each node is visited once.
// Space Complexity
// O(1) — only constant extra space is used.
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0); //new dummy node so that head remains safe
        dummy.next = head;   //dummy points to head
        ListNode curr = head;
        ListNode prev = dummy;
        
        while(curr != null){
            if(curr.val == val){
                prev.next = curr.next;  //skip current node by breaking off prev connection to it and making prev point the next node of curr
            }else{
                prev = curr; //move prev tp curr
            }
            curr = curr.next; //iterate to next even if deletion or not
        }
        return dummy.next;   //which points to head
    }
} {
    
}
