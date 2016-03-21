public class Main {

    public static void main(String[] args) {
	    Solution solution = new Solution();
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        solution.invertTree(treeNode1);
        System.out.println(treeNode1.val+ "" + treeNode1.left.val + "" +treeNode1.right.val);
    }
}
