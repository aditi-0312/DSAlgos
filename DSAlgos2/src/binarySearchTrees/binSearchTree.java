package binarySearchTrees;

public class binSearchTree {

	class Node {
		int value;
		Node left;
		Node right;

		public Node(int value) {
			this.value = value;
		}
	}

	static Node root;

	public void insert(int value) {
		root = insertNode(root, value);
	}

	public Node insertNode(Node root, int value) {

		if (root == null) {
			root = new Node(value);
			return root;
		}

		if (value < root.value)
			root.left = insertNode(root.left, value);
		else if (value > root.value)
			root.right = insertNode(root.right, value);

		return root;
	}

	public void SortedOrder() {
		inorderTraverse(root);
	}

	public void inorderTraverse(Node root) {
		if (root != null) {
			inorderTraverse(root.left);
			System.out.println(root.value);
			inorderTraverse(root.right);
		}
	}
	
	public int minElement(Node root) {
		Node current=root;
		
		while(current.left!=null) {
			current=current.left;
		}
		return current.value;
	}
	
	public int maxElement(Node root) {
		Node curr=root;
		while(curr.right!=null) {
			curr=curr.right;
		}
		return curr.value;
	}
	
	public int getHeight() {
		return Height(root);
	}
	public int Height(Node root) {
		if(root==null)
			return -1;
		else
			return 1+Math.max(Height(root.left), Height(root.right));
	}
	
	public boolean getSearch(int value) {
		return search(root, value);
	}
	public boolean search(Node root, int value) {
		if(root==null)
			return false;
		if(value==root.value)
			return true;
			
		if(value>root.value) 
			return search(root.right, value);
		
		else
			return search(root.left, value);
	}

	public static void main(String[] args) {
		binSearchTree tree = new binSearchTree();
		tree.insert(4);
		tree.insert(6);
		tree.insert(12);
		tree.insert(3);
		tree.insert(9);
		tree.insert(7);
		tree.insert(14);
		tree.insert(2);
		//sort logic aka Inorder Traversal
		tree.SortedOrder();
		System.out.println("minimum element in the tree = " +tree.minElement(root));
		System.out.println("maximum element in the tree = " +tree.maxElement(root));
		System.out.println("height of the tree is " +tree.getHeight());
		System.out.println(tree.getSearch(24));
		

	}

}