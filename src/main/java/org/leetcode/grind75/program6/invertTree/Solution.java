package org.leetcode.grind75.program6.invertTree;

/**
 * Definition for a binary tree node.
 **/
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {}

    TreeNode(int val) {this.val = val;}

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }


    public void traverseInOrder() {
        if (this.left != null) this.left.traverseInOrder();
        System.out.print(this.val + " ");
        if (this.right != null) this.right.traverseInOrder();
    }
}

class BinarySearchTree {
    TreeNode root;

    public void traverseInOrder() {
        if (this.root != null) this.root.traverseInOrder();
        System.out.println();
    }

}

class Solution {

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.root = new TreeNode(4);
        bst.root.left = new TreeNode(2);
        bst.root.left.left = new TreeNode(1);
        bst.root.left.right = new TreeNode(3);
        bst.root.right = new TreeNode(7);
        bst.root.right.left = new TreeNode(6);
        bst.root.right.right = new TreeNode(9);

        bst.traverseInOrder();
        new Solution().invertTree(bst.root);
        bst.traverseInOrder();
    }

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(temp);
        return root;
    }
}
