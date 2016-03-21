/**
 * Created by Covey on 2016/3/21.
 */

//Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode tempNode = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tempNode);
        return root;
    }
}