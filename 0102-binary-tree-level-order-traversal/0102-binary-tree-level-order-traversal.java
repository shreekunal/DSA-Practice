class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> out = new ArrayList<>();
        traverse(root, 0, out);
        return out;
    }

    public void traverse(TreeNode node, int level, List<List<Integer>> out) {
        if (node == null)
            return;
        if (out.size() == level) {
            out.add(new ArrayList<>());
        }
        out.get(level).add(node.val);
        traverse(node.left, level + 1, out);
        traverse(node.right, level + 1, out);
    }
}