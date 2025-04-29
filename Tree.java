import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class BinaryTree
{
	static class Node
	{
		Object data;
		Node left;
		Node right;
		
		Node(Object data)
		{
			this.data=data;
			this.left=this.right=null;
		}
	}

	public List<String> paths(Node root)
	{
		List<String> paths = new ArrayList<>();
		if(root!=null)
		    traverse(root,"",paths);
		return paths;
	}

	public void traverse(Node node, String path, List<String> paths)
	{
		if(node == null)
			return;

		path += node.data.toString();

		if(node.left == null && node.right == null)
			paths.add(path);
		else{
			path += "->";
			traverse(node.left, path, paths);
			traverse(node.right, path, paths);
		}
	}

	public static void main(String args[])
	{
		BinaryTree tree = new BinaryTree();

		Node root1 = new Node(10);
		root1.left = new Node(20);
		root1.right = new Node(30);
		root1.left.left = new Node(40);
		root1.left.right = new Node(50);

		System.out.println("Integer tree paths: ");
		List<String> paths1 = tree.paths(root1);
		for(String path: paths1)
			System.out.println(path);

		Node root2 = new Node("Ram");
		root2.left = new Node("Shyam");
		root2.right = new Node("Shamik");
		root2.left.right = new Node("Sounak");
		root2.right.left = new Node("Soumita");

		System.out.println("\nString Tree Paths:");
		List<String> paths2 = tree.paths(root2);
		for(String path: paths2)
			System.out.println(path);
	}
}

