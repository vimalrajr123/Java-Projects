package mypack1;

class Node {
	int data;
	Node left, right;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class BinaryInsersion {

	public static void main(String[] args) {
		Node rootNode = new Node(10);
		addNode(9, rootNode);
		addNode(11, rootNode);
		addNode(8, rootNode);
		addNode(13, rootNode);

	}

	private static void addNode(int data, Node root) {

		if (data < root.data) {
			if (root.left != null) {
				addNode(data, root.left);
			} else {
				root.left = new Node(data);
				//System.out.println("Insert value - " + data + "with the left Root Value - " + root.data);
				System.out.print(root.data + " ");
			}
		}
		if (data > root.data) {
			if (root.right != null) {
				addNode(data, root.right);
			} else {
				root.right = new Node(data);
				System.out.print(root.data + " ");
				//System.out.println("Insert value - " + data + "with the right Root Value - " + root.data);
			}
		}
	}

}

/*
 * Inserted 9 to left of Node 10 Inserted 11 to right of Node 10 Inserted 8 to
 * left of Node 9 Inserted 13 to right of Node 11
 */