package practice;

public class MaximumDepthBinaryTree_104 {
	/*
	 * Given a binary tree, find its maximum depth.
	 * 
	 * The maximum depth is the number of nodes along the longest path from the
	 * root node down to the farthest leaf node.
	 */

	public static void main(String[] args) {

		// step1: go through each node on the tree, set node.val to be depth of
		// the node
		// step2: go through each node on the tree, find the maximum node value
		// ** thinking: use a variable to always hold the biggest number

		TreeNode tree1 = new TreeNode(1);
		TreeNode tree1_l = new TreeNode(2);

		TreeNode tree1_r = new TreeNode(3);
		TreeNode tree1_r_r = new TreeNode(4);
		TreeNode tree1_r_r_l = new TreeNode(5);
		tree1.left = tree1_l;
		tree1.right = tree1_r;
		tree1.right.right = tree1_r_r;
		tree1.right.right.left = tree1_r_r_l;

		System.out.println(maxDepth(tree1));
	}

	public static int maxDepth(TreeNode root) {
		if (root == null)
			return 0;
		root.val = 1;

		return maxSubTreeDepth(root, 1);
	}

	public static int maxSubTreeDepth(TreeNode root, int max) {

		if (root.left == null && root.right == null)
			return root.val > max ? root.val : max;

		if (root.left != null) {
			root.left.val = root.val + 1;
			int max_sub = maxSubTreeDepth(root.left, root.left.val);
			max = max > max_sub ? max : max_sub;
		}
		if (root.right != null) {
			root.right.val = root.val + 1;
			int max_sub = maxSubTreeDepth(root.right, max);
			max = max > max_sub ? max : max_sub;
		}
		return max;
	}

}
