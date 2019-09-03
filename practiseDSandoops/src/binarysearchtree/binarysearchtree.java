package binarysearchtree;

import java.util.ArrayList;
import java.util.LinkedList;



public class binarysearchtree {
	
	private class Node{
		Node left;
		Node right;
		int data;
		public Node(int data,Node left,Node right) {
			this.data=data;
			this.left=left;
			this.right=right;
			
		}
	}

	Node root;
	int size;
	public binarysearchtree() {
		// TODO Auto-generated constructor stub
		this.root=null;
		this.size=0;
	}

	public void add(int data)
	{
		Node temp=new Node(data, null, null);
		this.size++;
		add(this.root,temp);
	}
	private void add(Node node,Node temp)
	{
		if(node==null)
		{
			this.root=temp;
		}
		else if(temp.data<node.data)
		{
			if(node.left==null)
			{
				node.left=temp;
			}
			else
			{
				add(node.left, temp);
			}
		}
		else
		{
			if(node.right==null)
			{
				node.right=temp;
			}
			else
			{
				add(node.right, temp);
			}
		}
	}
	
	
	
	
	
	public void display()
	{
		display(root);
	}
	private void display(Node node)
	{
		if(node.left!=null)
		{
			System.out.print(node.left.data+" => ");
		}
		else
		{
			System.out.print("END => ");
		}
		System.out.print(node.data);
		if(node.right!=null)
		{
			System.out.print(" <= "+node.right.data);
		}
		else
		{
			System.out.print(" <= END ");
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
	public int max()
	{
		return max(this.root,Integer.MIN_VALUE);
	}
	private int max(Node node,int max)
	{
		if(node==null)
		{
			return max;
		}
		if(node.data>max)
		{
			max=node.data;
		}
		return max(node.right, max);
		
		
	}
	public int min()
	{
		return min(this.root,Integer.MAX_VALUE);
	}
	private int min(Node node,int min)
	{
		if(node==null)
		{
			return min;
		}
		if(node.data<min)
		{
			min=node.data;
		}
		return min(node.left, min);
		
		
	}
	public void remove(int data)
	{
		remove(this.root,data,null,false);
		
	}
	private void remove(Node node,int data,Node parent,boolean isleft)
	{
		if(data<node.data)
		{
			remove(node.left, data, node, true);
		}
		else if(data>node.data)
		{
			remove(node.right, data, node, false);
		}
		else
		{
			if(node.left==null&&node.right==null)
			{
				if(isleft)
				{
					parent.left=null;
					
				}
				else
				{
					parent.right=null;
					
				}
			}
			else if(node.left==null)
			{
				if(isleft)
				{
					parent.left=node.right;
				}
				else
				{
					parent.right=node.right;
				}
			}
			else if(node.right==null)
			{
				if(isleft)
				{
					parent.left=node.left;
				}
				else
				{
					parent.right=node.left;
				}
				
			}
			else
			{ 
				int max=max(node.left, Integer.MIN_VALUE);
				node.data=max;
				remove(node.left, max, node, true);
			}
		}
	}
	public void preorder()
	{
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
	public void postorder()
	{
		postorder(root);
	}
	private void postorder(Node node)
	{
		if(node==null)
		{
			
			return;
		}
	
		
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data+" ");
	}
	public void inorder()
	{
		inorder(root);
	}
	private void inorder(Node node)
	{
		if(node==null)
		{
			
			return;
		}
	
		
		inorder(node.left);
		System.out.print(node.data+" ");
		inorder(node.right);
		
	}
	public void levelorder()
	{
		LinkedList<Node> queue = new LinkedList<>();
		queue.addLast(root);
		while(!queue.isEmpty())
		{
             Node temp=queue.removeFirst();
             System.out.print(temp.data+" ");
             if(temp.left!=null)
             {
            	 queue.addLast(temp.left);
             }
             if(temp.left!=null)
             {
            	 queue.addLast(temp.right);
             }
		}
	}
	public ArrayList<Integer> inorderlist()
	{
		ArrayList<Integer> list=new ArrayList<>();
		return inorderlist(root, list);
	}
	

	private ArrayList<Integer> inorderlist(Node node,ArrayList<Integer> anslist)
	{
		
		
		if(node.left!=null)
		{
			inorderlist(node.left, anslist);
		}
		anslist.add(node.data);
		if(node.right!=null)
		{
			inorderlist(node.right, anslist);
		}
		return anslist;
		
	}
	public void replacesumBST()
	{
		
		replacesumBST(root,inorderlist());
	}
	private void replacesumBST(Node node,ArrayList<Integer> inorderlist)
	{
		if(node==null)
		{
			return;
		}
		int i=inorderlist.size()-1;
		int m=inorderlist.get(i);
		int sum=0;
		while(m!=node.data)
		{
			sum=sum+m;
			i--;
			m=inorderlist.get(i);
		}
		node.data=sum;
		replacesumBST(node.left, inorderlist);
		replacesumBST(node.right, inorderlist);
		
	}
	






}
