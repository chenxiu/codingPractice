package practice;

/**
 * Definition for a binary tree node.
 */

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
	
	public static void utils(){
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
	}
	
}