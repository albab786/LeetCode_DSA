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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> zigzag = new ArrayList<>();
        if (root == null) return zigzag;
        Queue<TreeNode> queue = new LinkedList<>();
        boolean flag = false;
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            Stack<Integer> revStack = new Stack<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                if (flag) {
                    revStack.add(node.val);
                } else {
                    level.add(node.val);
                }
                if (node.left != null)
                    queue.add(node.left);
                if (node.right != null)
                    queue.add(node.right);
            }
            flag = !flag;
            // Pop all elements from stack
            while (!revStack.isEmpty())
                level.add(revStack.pop());

            zigzag.add(level);

        }
        return zigzag;
    }
}