class Solution {
    public List<String> binaryTreePaths(TreeNode root) {

        List <String> str = new ArrayList<>();
        traverse(root,str,"");
        return str;
    }
    private void traverse(TreeNode root, List<String> str, String s){
        if(root == null)
            return;
        if(root.left == null && root.right == null){
            str.add(s + root.val);
            return;
        }
        traverse(root.left, str, s + root.val + "->");
        traverse(root.right, str, s + root.val + "->"); 
    }
}