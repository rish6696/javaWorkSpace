package lecture14;

import java.util.Scanner;

public class BinaryTree {
	
	private class Node{
		Node left;
		Node right;
		int data;
		
		private Node(Node left,Node right,int data)
		{
			this.left=left;
			this.right=right;
			this.data=data;
			
		}
		
	}

	Node root;
	int size;
	public BinaryTree()
	{
		Scanner s=new Scanner(System.in);
		this.root=takeinput(s,null,false);
		
	}
	
	private Node takeinput(Scanner s,Node Parent,boolean isLeftOrRight)
	{
		if(Parent==null)
		{
			System.out.println("enter data for root node");
		}
		else {
			if(isLeftOrRight==true)
			{
				System.out.println("enter the data for left child of"+Parent.data);
				
			}
			else
			{
				System.out.println("enter the data for right child of"+Parent.data);
			}
		}
		int data=s.nextInt();
		Node node=new Node(null, null, data);
		this.size++;
		System.out.println("Does your node have left child of"+node.data);
		Boolean choice=s.nextBoolean();
		if(choice==true)
		{
			node.left=takeinput(s, node, true);
			
		}
		System.out.println("does you node have right child of"+node.data);
		choice=s.nextBoolean();
		if(choice==true)
		{
			node.right=takeinput(s, node, false);
		}
		return node;
	}
	public void display()
	{
		display(this.root);
		
	}
	private void display(Node node)
	{
		if(node.left!=null)
		{
			System.out.print(node.left.data+"=>");
		}
		else
		{
			System.out.print("End=>");
		}
		System.out.print(node.data);
		if(node.right!=null)
		{
			System.out.print( "<="+node.right.data);
		}
		else
		{
			System.out.print("<=End");
		}
		System.out.println();
		if(node.left!=null)
		{
			display(node.left);
		}
		if(node.right!=null)
		{
			display(node.right);
		}
		
		
		
		
		
	}
	public void preorder() {
		preorder(root);
		
	}
	private void preorder(Node node)
	{
		if(node==null)
		{
			return;
		}
		System.out.print(node.data+" ");
		preorder(node.left);
		preorder(node.right);
	
		
		
	}
	public void postorder() {
		postorder(root);
		
	}
	private void postorder(Node node)
	{
		if(node==null)
		{
			return;
		}
		//System.out.print(node.data+" ");
		preorder(node.left);
		preorder(node.right);
		System.out.print(node.data+" ");
		
	
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
