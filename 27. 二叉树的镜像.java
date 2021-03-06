/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = root.left != null ? root.left : null;
        root.left = root.right != null ? root.right : null;
        root.right = temp;
        if (root.left != null) mirrorTree(root.left);
        if (root.right != null) mirrorTree(root.right);
        return root;
    }
}
