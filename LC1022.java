// Approach
// Traverse the binary tree using DFS.
// Maintain an integer curr representing the decimal value of the binary number formed from root to current node.
// At each node, update curr using
// curr = (curr << 1) | node.val to append the current bit.
// When a leaf node is reached, add curr to the answer.
// Return the sum of values from left and right subtrees.
// Start DFS from the root with curr = 0.
// Time Complexity: O(N)
// Space Complexity: O(H) (recursion stack)

class Solution {
    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }

    private int dfs(TreeNode node, int val){
        if(node == null) return 0;

        val = (val << 1) | node.val;

        if(node.left == null && node.right == null){
            return val;
        }

        return dfs(node.left, val) + dfs(node.right, val);
    }
}