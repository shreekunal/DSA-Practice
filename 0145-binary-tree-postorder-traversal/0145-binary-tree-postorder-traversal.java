class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> out = new ArrayList<>();
        traverse(root, out);
        return out;
    }
    public void traverse(TreeNode root, List<Integer> out){
        if(root == null) return;
        traverse(root.left, out);
        traverse(root.right, out);
        out.add(root.val);
    }
}