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
    public TreeNode sortedArrayToBST(int[] nums) {
          return tree(nums, 0, nums.length - 1); // Helper method 
    }
    private TreeNode tree(int[] nums, int left, int right){ // Implementaion of helper method
        if(left > right){
            return null;
        }
        int middle = (left + right) / 2; // findout middle element.
        TreeNode root = new TreeNode(nums[middle]); // Set root to the middle element.
        root.left = tree(nums, left, middle - 1); // Insert smaller elements on left
        root.right = tree(nums, middle + 1, right);
        return root; // return root;
    }
}