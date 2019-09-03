package binarytree;

import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class BinaryTree {
	private class Node {
		int data;
		Node left;
		Node right;

		Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	private Node root = null;
	private int size = 0;

	public BinaryTree() {
		// TODO Auto-generated constructor stub
		Scanner s = new Scanner(System.in);
		this.root = takeInput(s, null, false);
	}

	private Node takeInput(Scanner s, Node parent, boolean isLeftOrRight) {
		if (parent == null) {
			System.out.println("Enter the data for root node");
		} else {
			if (isLeftOrRight) {
				System.out.println("Enter the data for left child of " + parent.data);
			} else {
				System.out.println("Enter the data for right child of " + parent.data);
			}
		}

		int nodeData = s.nextInt();
		Node node = new Node(nodeData, null, null);
		this.size++;

		boolean choice = false;
		System.out.println("Do you have left child for " + node.data);
		choice = s.nextBoolean();
		if (choice) {
			node.left = this.takeInput(s, node, true);
		}

		choice = false;
		System.out.println("Do you have right child for " + node.data);
		choice = s.nextBoolean();
		if (choice) {
			node.right = this.takeInput(s, node, false);
		}

		return node;
	}

	public void display() {
		this.display(this.root);
	}

	private void display(Node node) {
		if (node.left != null) {
			System.out.print(node.left.data + "=>");
		} else {
			System.out.print("END=>");
		}

		System.out.print(node.data);

		if (node.right != null) {
			System.out.print("<=" + node.right.data);
		} else {
			System.out.print("<=END");
		}
		System.out.println();
		if (node.left != null) {
			this.display(node.left);
		}

		if (node.right != null) {
			this.display(node.right);
		}
	}

	public int size2() {
		return this.size2(this.root);
	}

	private int size2(Node node) {
		if (node == null) {
			return 0;
		}
		int lsize = this.size2(node.left);
		int rsize = this.size2(node.right);
		return lsize + rsize + 1;
	}

	public int max() {
		return this.max(this.root);
	}

	private int max(Node node) {
		if (node == null) {
			return Integer.MIN_VALUE;
		}
		int lmax = this.max(node.left);
		int rmax = this.max(node.right);
		return Math.max(node.data, Math.max(lmax, rmax));
	}

	public int min() {
		return this.min(this.root);
	}

	private int min(Node node) {
		if (node == null) {
			return Integer.MAX_VALUE;
		}
		int lmin = this.min(node.left);
		int rmin = this.min(node.right);
		return Math.min(node.data, Math.min(lmin, rmin));
	}

	public int height() {
		return this.height(this.root);
	}

	private int height(Node node) {
		if (node == null) {
			return -1;
		}
		int lheight = this.height(node.left);
		int rheight = this.height(node.right);
		return Math.max(lheight, rheight) + 1;
	}

	public void preOrder() {
		this.preOrder(this.root);
	}

	private void preOrder(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		this.preOrder(node.left);
		this.preOrder(node.right);
	}

	public void inOrder() {
		this.inOrder(this.root);
	}

	private void inOrder(Node node) {
		if (node == null) {
			return;
		}

		this.inOrder(node.left);
		System.out.print(node.data + " ");
		this.inOrder(node.right);
	}

	public void postOrder() {
		this.postOrder(this.root);
	}

	private void postOrder(Node node) {
		if (node == null) {
			return;
		}

		this.postOrder(node.left);

		this.postOrder(node.right);
		System.out.print(node.data + " ");
	}

	public void levelOrder() {
		LinkedList<Node> queue = new LinkedList<>();
		queue.addLast(this.root);
		while (!queue.isEmpty()) {
			Node rv = queue.removeFirst();
			System.out.print(rv.data + " ");
			if (rv.left != null) {
				queue.addLast(rv.left);
			}
			if (rv.right != null) {
				queue.addLast(rv.right);
			}
		}
	}

	
	public boolean isBst() {
		return this.isBst(this.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
	private boolean isBst(Node node,int min,int max) {
		if(node==null) {
			return true;
		}
		if(node.data<min||node.data>max) {
			return false;
		}
		boolean leftans=isBst(node.left, min, node.data);
		if(!leftans) {
			return false;
		}
		boolean rightans=isBst(node.right, node.data, max);
		if(!rightans) {
			return false;
		}
		
		return true;
		
	}
	public boolean heightisbalanced()
	{
		return heightisbalnaced(root);
	}
	private boolean heightisbalnaced(Node node)
	{
		if(node==null)
		{
			return true;
		}
		int lh=height(node.left);
		int rh=height(node.right);
		int tans=lh-rh;
		tans=Math.abs(tans);
		if(tans>1)
		{
			return false;
		}
		boolean lans=heightisbalnaced(node.left);
		if(!lans)
		{
			return false;
		}
		return heightisbalnaced(node.right);
		

		
	}
}
