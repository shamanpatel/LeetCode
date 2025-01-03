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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder = new ArrayList<>();
        preorderRec(root, preorder);
        return preorder;
    }
    private void preorderRec(TreeNode node, List<Integer> preorder){
        if(node != null){
            preorder.add(node.val);
            preorderRec(node.left, preorder);
            preorderRec(node.right, preorder);
        }
    }
}