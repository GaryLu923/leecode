package leetcode.main.tree;

/**
 * @author gary.lu 2017.08.02 TreeNode class
 */
public class TreeNode {
	int value = 0;
	TreeNode left;
	TreeNode right;
	TreeNode parent;

	TreeNode(int x) {
		value = x;
	}

	public TreeNode addLeftNode(TreeNode treeNode) {
		left = treeNode;
		return this;
	}

	public TreeNode addParentNode(TreeNode treeNode) {
		parent = treeNode;
		return this;
	}

	public TreeNode addRightNode(TreeNode treeNode) {
		right = treeNode;
		return this;
	}

	public TreeNode getLeftNode() {
		return left;
	}

	public TreeNode getParentNode() {
		return parent;
	}

	public TreeNode getRightNode() {
		return right;
	}
}