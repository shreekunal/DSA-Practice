class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> out = new ArrayList<>();
        traverse(root, out, 0);
        for(int i = 1; i<out.size(); i+=2){
            Collections.reverse(out.get(i));
        }
        return out;
    }

    public void traverse(TreeNode node, List<List<Integer>> out, int lvl) {
        if (node == null) return;
        if (out.size() == lvl) {
            out.add(new ArrayList<>());
        }
        out.get(lvl).add(node.val);
        traverse(node.left, out, lvl + 1);
        traverse(node.right, out, lvl + 1);
    }
}