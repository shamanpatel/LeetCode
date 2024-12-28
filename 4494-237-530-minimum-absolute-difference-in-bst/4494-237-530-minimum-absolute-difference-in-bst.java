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
    int answer = Integer.MAX_VALUE;
    TreeNode prev;
    public int getMinimumDifference(TreeNode root) {
        solve(root);
        return answer;
    }
    public void solve(TreeNode root){
        if(root == null)return;
        solve(root.left);
        if(prev != null){
            answer = Math.min(answer, root.val - prev.val);
        }
        prev = root;
        solve(root.right);
    }
}