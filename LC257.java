// Approach
// Use DFS (preorder) to traverse the tree.
// Carry the current path as a string from root to the current node.
// When a leaf node is reached, add the built path to the result list.
// Append "->" only when moving to child nodes.
// Time Complexity
// O(n) — each node is visited once.
// space comlexity
// O(h) — recursion stack (h = height of the tree).
// O(n) 
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null) return res;
        dfs(root, "", res);
        return res;
    }

    private void dfs(TreeNode node, String path, List<String> res) {
        if (node == null) return;

        path += node.val;

        if (node.left == null && node.right == null) {
            res.add(path);
            return;
        }

        dfs(node.left, path + "->", res);
        dfs(node.right, path + "->", res);
    }
}