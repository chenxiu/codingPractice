package practice;

public class SameTree_100 {
	/*
	 * Given two binary trees, write a function to check if they are equal or
	 * not.
	 * 
	 * Two binary trees are considered equal if they are structurally identical
	 * and the nodes have the same value.
	 */
	public static void main(String[] args) {

		// step1: check null

		// step2: check root
		// step3: if has left sub-tree, validate left-tree
		// step4: if has right sub-tree, validate right sub-tree

		// step 2-4 should be combined into one helper method

		TreeNode tree1 = new TreeNode(1);
		TreeNode tree1_l = new TreeNode(2);
		TreeNode tree1_r = new TreeNode(3);
		TreeNode tree1_r_r = new TreeNode(4);
		tree1.left = tree1_l;
		tree1.right = tree1_r;
		tree1.right.right = tree1_r_r;

		TreeNode tree2 = new TreeNode(1);
		TreeNode tree2_l = new TreeNode(2);
		TreeNode tree2_r = new TreeNode(3);
		TreeNode tree2_r_r = new TreeNode(4);
		tree2.left = tree2_l;
		tree2.right = tree2_r;
		tree2.right.right = tree2_r_r;

		System.out.println(isSameTree(tree1, tree2));

	}

	public static boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null)
			return true;
		if ((p == null && q != null) || (q == null && p != null))
			return false;
		if (p.val != q.val)
			return false;
		if (!isSameTree(p.left, q.left))
			return false;
		if (!isSameTree(p.right, q.right))
			return false;

		return true;
	}
}
