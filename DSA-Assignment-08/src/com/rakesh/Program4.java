package com.rakesh;

public class Program4 {

	public static void addPath(TreeNode node, StringBuilder path) {
		if (node == null)
			return;
		path.append(node.val);
		if (node.left == null && node.right == null)
			return;
		else {
			if (node.left == null) {
				path.append("()(");
				addPath(node.right, path);
				path.append(")");
			} else {
				path.append("(");
				addPath(node.left, path);
				path.append(")");
				if (!(node.right == null)) {
					path.append("(");
					addPath(node.right, path);
					path.append(")");
				}
			}
		}
	}

	public static String treeStr(TreeNode root) {
		StringBuilder res = new StringBuilder();
		addPath(root, res);
		return res.toString();
	}

	public static void main(String[] args) {
		String ss = "4(2(3)(1))(6(5))";
		System.out.println(treeStr(ss));
	}
}