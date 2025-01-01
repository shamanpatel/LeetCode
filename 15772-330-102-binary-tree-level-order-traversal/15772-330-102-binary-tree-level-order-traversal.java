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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>(); // Created an array list to store the nodes.
        if(root == null){
            return result;
        }
        Queue<TreeNode> bfs = new LinkedList<>(); // Using queue to traverse the nodes level by level
        bfs.add(root);

        while(!bfs.isEmpty()){ // While queue not get empty
            int size = bfs.size();
            List<Integer> current = new ArrayList<>();

            for(int i = 0; i < size; i++){ // Iterating the queue
                TreeNode currentNode = bfs.poll(); // Get the first element from the queue
                current.add(currentNode.val); // Add that value 
                if(currentNode.left != null){ // If left node is not null than add it to the queue
                    bfs.add(currentNode.left);
                }
                if(currentNode.right != null){ // Same for the right node
                    bfs.add(currentNode.right);
                }
            }
        result.add(current); // Add the current list to the result list
        }
        return result; // Return result
    }
}