// Approach
// Treat the problem as divide and conquer on a tree
// Define depth of a node as 1 + maximum depth of its subtrees
// Use recursion to ask left and right children for their depths
// Base case: a null node contributes depth 0
// Compare left and right subtree depths
// Add 1 to include the current node
// Return the computed value upward to the parent
// Final value returned from the root is the maximum depth of the tree
// time: O(n), n = number of nodes
// space: O(h), h = height of tree

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int leftHt = maxDepth(root.left);
        int rightHt = maxDepth(root.right);
        return 1 + Math.max(leftHt, rightHt);
    }
}