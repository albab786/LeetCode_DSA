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
    public int countNodes(TreeNode root) {
       if (root == null) return 0;

        int height = 0;
        TreeNode left = root.left;
        TreeNode right = root.right;

        // Check if this subtree is a perfect binary tree
        while (left != null && right != null) {
            height++;
            left = left.left;
            right = right.right;
        }

        // If perfect tree: total nodes = 2^(height+1) - 1
        if (left == right) {
            return (int) Math.pow(2, height + 1) - 1;
        }

        // Otherwise count normally
        return 1 + countNodes(root.left) + countNodes(root.right);
}
}