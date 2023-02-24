package binarySearchTrees;

public class BinSearchTree1 {

	class Node {
		int val;
		Node left;
		Node right;

		public Node(int val) {
			this.val = val;
		}
	}

	Node root;

	public void setInsert(int val) {
		root = insert(root, val);
	}

	public Node insert(Node root, int val) {
		if (root == null) {
			root = new Node(val);
			return root;
		}
		if (val < root.val)
			root.left = insert(root.left, val);
		else if (val > root.val)
			root.right = insert(root.right, val);

		return root;
	}

	public void sortedOrder() {
		inorderTraverse(root);
	}

	public void inorderTraverse(Node root) {
		if (root != null) {
			inorderTraverse(root.left);
			System.out.println(root.val);
			inorderTraverse(root.right);
		}
	}

	public Node delNode(int val) {
		return deleteNode(root, val);
	}

	public static Node deleteNode(Node root, int val) {
		if (root == null)
			return root;
		if (val < root.val)
			root.left = deleteNode(root.left, val);

		else if (val > root.val)
			root.right = deleteNode(root.right, val);
		else {
			if (root.left == null)
				return root.right;
			else if (root.right == null)
				return root.left;

			root.val = minElement(root.right);

			root.right = deleteNode(root.right, root.val);
		}
		return root;

	}

	public static int minElement(Node root) {
		Node current = root;

		while (current.left != null) {
			current = current.left;
		}
		return current.val;
	}

	public static void main(String[] args) {
		BinSearchTree1 tree = new BinSearchTree1();
		tree.setInsert(1);
		tree.setInsert(4);
		tree.setInsert(3);
		tree.setInsert(5);
		tree.setInsert(19);

		tree.delNode(3);

		tree.sortedOrder();

	}

}
