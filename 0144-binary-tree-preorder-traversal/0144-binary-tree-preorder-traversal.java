class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> out = new ArrayList<>();
        traverse(out, root);
        return out;
    }
    public void traverse(List<Integer> li, TreeNode root){
        if(root == null) return; 
        li.add(root.val);
        traverse(li, root.left);
        traverse(li, root.right);
    }
}