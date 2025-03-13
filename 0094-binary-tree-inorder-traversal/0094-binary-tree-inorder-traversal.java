class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> out = new ArrayList<>();
        traverse(out, root);
        return out;
    }
    public void traverse(List<Integer> out, TreeNode root){
        if(root == null) return;
        traverse(out, root.left);
        out.add(root.val);
        traverse(out, root.right);
    }
}