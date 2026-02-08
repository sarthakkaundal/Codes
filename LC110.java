//Approach
// Use a recursive helper function that computes the height of the tree while simultaneously checking balance.
// The helper function follows these rules:
// If the current node is null, return height 0.
// Recursively compute the heights of the left and right subtrees.
// If either subtree is already unbalanced (indicated by height -1), immediately return -1.
// If the absolute difference between left and right subtree heights is greater than 1, return -1 to signal imbalance.
// Otherwise, return the height of the current subtree as
// 1 + max(leftHeight, rightHeight).
// The main function calls the helper on the root:
// If the helper returns -1, the tree is not balanced.
// Otherwise, the tree is balanced.
// Time Complexity: O(n) — each node is visited once.
// Space Complexity: O(h) — recursion stack space, where h is the height of the tree (worst case O(n)).

 class Solution {
    public int helper(TreeNode root){
        if(root == null) return 0;

        int leftHeight = helper(root.left);
        int rightHeight = helper(root.right);
        
        if(leftHeight < 0 || rightHeight < 0){
            return -1;
        }

        if(Math.abs(leftHeight - rightHeight) > 1){
            return -1;
        }
        return 1 + Math.max(leftHeight ,rightHeight);
    }
    public boolean isBalanced(TreeNode root) {
        return helper(root) != -1;
    }
}

 
