package leetcode.main.tree;

/**
 * @author gary.lu 2017.08.02 Solution for no.222 problem
 *
 *
 */

public class Solution {

	public int countNodes(TreeNode root) {
		int height = this.height(root);

		return height < 0 ? 0
				: height(root.right) == height - 1 ? (1 << height) + countNodes(root.right)
						: (1 << height - 1) + countNodes(root.left);
	}

	int height(TreeNode root) {
		return root == null ? -1 : 1 + height(root.left);
	}

}
