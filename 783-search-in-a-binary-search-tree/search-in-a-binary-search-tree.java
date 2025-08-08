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
    public TreeNode searchBST(TreeNode root, int x) {
        if(root==null)
        return null;
        else if(root.val==x)
        return root;
        else if(root.val<x)
        return searchBST(root.right,x);
        else
        return searchBST(root.left,x);
        
    }
}