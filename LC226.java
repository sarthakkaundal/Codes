// Approach
// Use recursion to process the tree node by node
// Base case: if the current node is null, return null
// At each node:
// Temporarily store the left child
// Recursively invert the right subtree and assign it to the left
// Recursively invert the stored left subtree and assign it to the right
// This performs a post-order–style swap, ensuring children are inverted before final placement
// Return the current node as the root of the inverted subtree
// time: O(n), n=no of nodes
// space: o(h), height of tree

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
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }
}