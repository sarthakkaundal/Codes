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
// Approach 
// Use two pointers, currA starting at headA and currB starting at headB.
// Traverse both lists one step at a time.
// When a pointer reaches the end (null), redirect it to the head of the other list.
// This redirection makes both pointers traverse the same total distance (lengthA + lengthB).
// If an intersection exists, both pointers will eventually point to the same node at the same time.
// If no intersection exists, both pointers will become null together and the loop ends.
// Return the node where both pointers meet (or null if they don’t).
// ⏱️ Complexity
// Time: O(n + m)
// Space: O(1)

public class LC160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode currA = headA;
        ListNode currB = headB;
        while(currA != currB){
            if(currA == null){
                currA = headB;
            }else{
                currA = currA.next;
            }
            if(currB == null){
                currB = headA;
            }else{
                currB = currB.next;
            }
        }
        return currB;
    }
}