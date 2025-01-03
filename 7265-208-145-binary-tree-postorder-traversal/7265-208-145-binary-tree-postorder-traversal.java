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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> postorder = new ArrayList<>();
        postorderRec(root, postorder);
        return postorder;
    }
    private void postorderRec(TreeNode node, List<Integer> postorder){
        if(node == null){
            return;
        }
        postorderRec(node.left, postorder);
        postorderRec(node.right, postorder);
        postorder.add(node.val);
    }
}