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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        inorderRec(root, inorder);
        return inorder;
    }
    private void inorderRec(TreeNode node, List<Integer> inorder){
        if(node != null){
            inorderRec(node.left, inorder);
            inorder.add(node.val);
            inorderRec(node.right, inorder);
        }
    }
}