
class Solution {
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
    longestPath(root);
    return diameter;
    }

    private int longestPath(TreeNode root){
        if(root==null)return 0;
        int leftLongestPath=longestPath(root.left);
        int rightLongestPath=longestPath(root.right);
        diameter=Math.max(leftLongestPath+rightLongestPath,diameter);
        return Math.max(leftLongestPath,rightLongestPath)+1;

    }
}