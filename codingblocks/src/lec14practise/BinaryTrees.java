package lec14practise;

import java.util.Scanner;
public class BinaryTrees {
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
	public BinaryTrees()
	{
		Scanner s=new Scanner(System.in);
		this.root=takeinput(s,null,false);
	}
	public Node takeinput(Scanner s,Node parent,boolean isleft)
	{
		if(parent==null)
		{
			System.out.println("enter the data for root node");
		}
		else
		{
			if(isleft==true)
			{
				System.out.println("enter the data for left child of "+parent.data);
			}
			else
			{
				System.out.println("enter the data for right child of "+parent.data);

			}
			
		}
		int data=s.nextInt();
		Node node=new Node(null, null, data);
		this.size++;
		System.out.println("does "+node.data+" has a left child");
		boolean choice;
		choice=s.nextBoolean();
		if(choice==true)
		{
			node.left=takeinput(s, node, true);
		}
		System.out.println("does "+node.data+" has a right child");
		
		choice=s.nextBoolean();
		if(choice==true)
		{
			node.right=takeinput(s, node, false);
		}
		
		return node;
		
//		//int data=s.nextInt();
//		Node node=new Node(null, null, data);
//		this.size++;
//		System.out.println("Does your node have left child of"+node.data);
//		Boolean choice=s.nextBoolean();
//		if(choice==true)
//		{
//			node.left=takeinput(s, node, true);
//			
//		}
//		System.out.println("does you node have right child of"+node.data);
//		choice=s.nextBoolean();
//		if(choice==true)
//		{
//			node.right=takeinput(s, node, false);
//		}
//		return node;
	}
    public void display()
    {
    	this.display(this.root);
    }
    
    private void display(Node node)
    {
    	if(node.left!=null)
    	{
    		System.out.print(node.left.data+"=>");
    	}
    	else
    	{
    		System.out.print("END=>");
    	}
    	System.out.print(node.data);
    	if(node.right!=null)
    	{
    		System.out.print("<="+node.right.data);
    	}
    	else
    	{
    		System.out.print("<=END");
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
    	int ans=ls+rs+1;
    	return ans;
    }
    public int max()
    {
    	return max(this.root);
    }
    private int max(Node node)
    {
    	if(node==null)
    	{
    		return Integer.MIN_VALUE;
    	}
    	
    	
    	
    	int lmax=max(node.left);
    	int rmax=max(node.right);
    	int ans=Math.max(node.data, Math.max(lmax, rmax));
    	return ans;
    }
    public int min()
    {
    	return min(this.root);
    }
    private int min(Node node)
    {
    	if(node==null)
    	{
    		return Integer.MAX_VALUE;
    	}
    	
    	
    	
    	int lmin=min(node.left);
    	int rmin=min(node.right);
    	int ans=Math.min(node.data, Math.min(lmin, rmin));
    	return ans;
    }
    public int height()
    {
    	return height(this.root);
    }
    private int height(Node node)
    {
    	if(node==null)
    	{
    		return -1;
    	}
    	
    	
    	
    	int lheight=height(node.left);
    	int rheight=height(node.right);
    	int ans=Math.max(lheight,rheight)+1;
    	return ans;
    }
    public void preorder()
    {
    	preorder(this.root);
    }
    
    
    private void preorder(Node node) {
    
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
    	postorder(this.root);
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
    	inorder(this.root);
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

    public boolean isbst()
    {
    	boolean ans=isbst(this.root,null,true);
    	return ans;
    	
    }
    
    private boolean isbst(Node node,Node parent,boolean isleftchild)
    {
    	if(node.left==null||node.right==null)
    	{
    		return true;
    	}
    	if(isleftchild==true&&parent!=null)
    	{
    		if(node.right.data>parent.data||node.left.data>parent.data)
    		{
    			return false;
    		}
    	}
    	if(isleftchild==false)
    	{
    		if(node.right.data<parent.data||node.left.data<parent.data)
    		{
    			return false;
    		}
    		
    	}
    	if(node.right.data>node.data&&node.left.data<node.data)
    	{
    		boolean recans=isbst(node.left,node,true);
    		if(recans==false)
    		{
    			return false;
    		}
    		else
    		{
    			boolean rec0ans=isbst(node.right,node,false);
    			if(rec0ans==true)
    			{
    				return true;
    			}
    			else
    			{
    				return false;
    			}
    		}
    		
    	}
    	else
    	{
    		return false;
    	}
    }

}
