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
    public TreeNode invertTree(TreeNode root) {
        if(root == null){ // If root is null return null
            return null;
        }
        TreeNode temp = root.left; // Temporaray node to store the left node.
        root.left = root.right; // Change the values of left and right
        root.right = temp; // again asign temp.

        invertTree(root.left); // Recursion.
        invertTree(root.right);
        return root;
    }
}