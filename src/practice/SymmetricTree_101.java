package practice;

public class SymmetricTree_101 {
	/*
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3
Note:
Bonus points if you could solve it both recursively and iteratively.
	 */

	public static void main(String[] args) {

		// The basic idea here is to rotate the whole tree
		// all left node move to right side, right node move to left side

		TreeNode tree1 = new TreeNode(1);
		TreeNode tree1_l = new TreeNode(2);
		TreeNode tree1_l_l = new TreeNode(3);
		TreeNode tree1_r = new TreeNode(2);
		TreeNode tree1_r_r = new TreeNode(3);
		tree1.left = tree1_l;
		tree1.left.left = tree1_l_l;
		tree1.right = tree1_r;
		tree1.right.right = tree1_r_r;

		System.out.println(isSymmetric(tree1));
	}

	public static boolean isSymmetric(TreeNode root) {
		if (root == null)
			return true;
		TreeNode newTree = new TreeNode(root.val);
		generateSymmetricTree(root, newTree);

		if(isSameTree(root, newTree)) return true;
		return false;
	}

	private static void generateSymmetricTree(TreeNode root, TreeNode tree2) {
		if(root.left!=null){
			TreeNode right = new TreeNode(root.left.val);
			tree2.right = right;
			generateSymmetricTree(root.left, tree2.right);
		}
		if(root.right!=null){
			TreeNode left = new TreeNode(root.right.val);
			tree2.left = left;
			generateSymmetricTree(root.right, tree2.left);
		}
		if(root.left==null && root.right==null)
			return;
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
