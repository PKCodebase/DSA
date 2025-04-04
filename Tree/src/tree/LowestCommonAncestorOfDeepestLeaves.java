package tree;



public class LowestCommonAncestorOfDeepestLeaves {
    private Node lca(TreeNode root) {
        if (root == null)
            return new Node(0, null);

        Node left = lca(root.left);
        Node right = lca(root.right);

        if (left.depth == right.depth) {
            return new Node(left.depth + 1, root);
        } else if (left.depth > right.depth) {
            return new Node(left.depth + 1, left.node);
        } else {
            return new Node(right.depth + 1, right.node);
        }
    }

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        return lca(root).node;
    }

    public static void main(String[] args) {
        LowestCommonAncestorOfDeepestLeaves obj = new LowestCommonAncestorOfDeepestLeaves();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        TreeNode lca = obj.lcaDeepestLeaves(root);
        System.out.println("LCA of Deepest Leaves: " + lca.val);
    }
}