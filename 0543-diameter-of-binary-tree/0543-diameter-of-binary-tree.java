class Solution {
    private int dia = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return dia;
    }

    public int height(TreeNode node) {
        if (node == null)
            return 0;
        int left = height(node.left);
        int right = height(node.right);
        dia = Math.max(dia, left + right);
        return Math.max(left, right) + 1;
    }
}