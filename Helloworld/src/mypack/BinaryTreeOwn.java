package mypack;

//import mypack1.Node;

class Node {

	Node left;
	Node right;
	int data;

	Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

public class BinaryTreeOwn {

	public static void main(String[] args) {

	//	Node rootnode = new Node(25);
		Node rootNode = new Node(10);
		insert( rootNode, 9);
		insert(rootNode, 11);
		insert( rootNode, 8);
		insert(rootNode, 13);
		

		/*
		 * insert(rootnode, 11); insert(rootnode, 15); insert(rootnode, 16);
		 * insert(rootnode, 23); insert(rootnode, 79);
		 */

	}

	private static void insert(Node root, int data) {

		if (data < root.data) {

			if (root.left != null) {
				insert(root.left, data);
			} else {
				root.left = new Node(data);
				System.out.println("Left " + data + "With Root" + root.data);
			}
		}

		if (data > root.data) {

			if (root.right != null) {
				insert(root.right, data);

			} else {
				root.right = new Node(data);
				System.out.println("Right " + data + "With Root" + root.data);
			}
		}

	}

}

/*
 * Left 11 Left 15 Left 16 Left 23 Right79
 * 
 * Inserted 11 to left of Node 25 Inserted 15 to right of Node 11 Inserted 16 to
 * right of Node 15 Inserted 23 to right of Node 16 Inserted 79 to right of Node
 * 25
 */
