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
    public int maxDepth(TreeNode root) {
        if(root == null){ // If root is null return 0
            return 0;
        }
        int left = maxDepth(root.left); // Else use recursion to get the most left nodde
        int right  = maxDepth(root.right); // Or get the right node
        return Math.max(left, right) + 1; // Return the max
    }
}