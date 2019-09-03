package dikshu;

import java.util.Scanner;

public class Binarytree {
	
	private  class Node {
		int data;
		Node left;
		Node right;
		
		public Node(int data,Node left,Node right) {
			this.data=data;
			this.left=left;
			this.right=right;
		}
		
	}

	 private Node root;
	 private int size=0;
	 
	public Binarytree() {
		Scanner s=new Scanner(System.in);
		
		this.root=takeinput(s,null,false);
	}
	private Node takeinput(Scanner s,Node parent,boolean isleft)
	{
		
		if(parent==null)
		{
			System.out.println("enter the data for root node");
		}
		else
		{
			if(isleft)
			{
				System.out.print("enter the data for left child of"+parent.data);
			}
			else
			{
				System.out.print("enter the data for right child of"+parent.data);
			}
		}
		int value=s.nextInt();
		Node node=new Node(value, null, null);
		this.size++;
		System.out.println("does"+ node.data+" has a left child");
		boolean choice=s.nextBoolean();
		if(choice)
		{
			node.left=takeinput(s, node, true);
		}
		System.out.println("does"+ node.data+" has a right child");
		choice=s.nextBoolean();
		if(choice)
		{
			node.right=takeinput(s, node, false);
		}
		return node;
		
		
	}

	public void  display()
	{
		display(this.root);
	}
	private void display(Node node)
	{
		
		if(node.left!=null)
		{
			System.out.print(node.left.data+"==>");
		}
		else
		{
			System.out.print("END==>");
		}
		System.out.print(node.data);
		if(node.right!=null)
		{
			System.out.print("<=="+node.right.data);
		}
		else
		{
			System.out.print("<==END");
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
	public int size()
	{
		return this.size;
	}
    
	public int size1()
	{
		return size1(this.root);
	}
	private int size1(Node node)
	{
		if(node==null)
		{
			return 0;
		}
		int ls=size1(node.left);
		int rs=size1(node.right);
		return ls+rs+1;
	}
	
	
}
