class Solution {
    public boolean isUnivalTree(TreeNode root) {

        // Base case
        if (root == null) {
            return true;
        }

        // Check left child
        if (root.left != null) {
            if (root.left.val != root.val) {
                return false;
            }
        }

        // Check right child
        if (root.right != null) {
            if (root.right.val != root.val) {
                return false;
            }
        }

        // Recursively check left subtree
        boolean left = isUnivalTree(root.left);

        // Recursively check right subtree
        boolean right = isUnivalTree(root.right);

        // Both subtrees must be univalued
        if (left && right) {
            return true;
        } else {
            return false;
        }
    }
}