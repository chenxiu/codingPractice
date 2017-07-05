package practice;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
	/*
	 * Given a binary tree, return the inorder traversal of its nodes' values.
	 * 
	 * For example: Given binary tree [1,null,2,3], 1 \ 2 / 3 return [1,3,2].
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

		List<Integer> result = inorderTraversal(tree1);
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}

	private static List<Integer> inorderTraversal(TreeNode tree1) {
		List<Integer> result = new ArrayList<Integer>();
		if (tree1 == null) {
			return result;
		}
		if (tree1.left != null) {
			result.addAll(inorderTraversal(tree1.left));
		}
		result.add(tree1.val);
		if (tree1.right != null) {
			result.addAll(inorderTraversal(tree1.right));
		}
		return result;
	}

}
