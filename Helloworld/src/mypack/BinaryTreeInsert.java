package mypack;

public class BinaryTreeInsert   
{  
    public static void main(String[] args)   
    {  
        new BinaryTreeInsert().run();  
    }  
    static class Node   
    {  
        Node left;  
        Node right;  
        int value;  
        public Node(int value)   
        {  
            this.value = value;  
        }  
    }  
    public void run()   
    {  
        Node rootnode = new Node(10);  
        System.out.println("Building tree with root value " + rootnode.value);  
        System.out.println("=================================");  
        insert(rootnode, 9);  
        insert(rootnode, 11);  
        insert(rootnode, 8);  
        insert(rootnode, 13);  
     //   insert(rootnode, 79);  
        
        
		/*
		 * addNode(9, rootNode); addNode(11, rootNode); addNode(8, rootNode);
		 * addNode(13, rootNode);
		 */
      System.out.println(rootnode.value);
    }  
    public void insert(Node node, int value)   
    {  
        if (value < node.value)   
        {  
            if (node.left != null)   
            {  
                insert(node.left, value);  
            } else   
            {  
                System.out.println("  Inserted " + value + " to left of Node " + node.value);  
                node.left = new Node(value);  
            }  
        }   
        else if (value > node.value)   
        {  
            if (node.right != null)   
            {  
                insert(node.right, value);  
            } else   
            {  
                System.out.println("  Inserted " + value + " to right of Node " + node.value);  
                node.right = new Node(value);  
            }  
        }  
    }  
}  