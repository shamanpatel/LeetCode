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
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0; // If the node is null, the depth is 0.
        }
        int left = minDepth(root.left) + 1; // Recursively find depth of left subtree, adding 1 for current node.
        int right = minDepth(root.right) + 1; // Recursively find depth of right subtree, adding 1 for current node.
        if (root.left == null) {
            return right; // If left child is null, only consider the depth of the right subtree.
        }
        if (root.right == null) {
            return left; // If right child is null, only consider the depth of the left subtree.
        }
        return Math.min(left, right); // If both children exist, return the smaller depth.
    }
}