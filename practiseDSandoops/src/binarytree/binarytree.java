package binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;



public class binarytree {
	
	private class Node
	{
		int data;
		Node left;
		Node right;
		public Node(int data,Node left,Node right)
		{
			this.data=data;
			this.left=left;
			this.right=right;
			
		}
	}

	private Node root;
	private int size;
	
	public binarytree() {
		// TODO Auto-generated constructor stub
		this.size=0;
		Scanner s=new Scanner(System.in);
		this.root=takeinput(s,null,false);
			
	}
	private Node takeinput(Scanner s ,Node parent, boolean isLeft)
	{
		if(parent==null)
		{
			System.out.println("enter the data for root node");
		}
		else
		{
			if(isLeft)
			{
				System.out.println("enter the data for left child of "+parent.data);
			}
			else
			{
				System.out.println("enter the data for right child of "+parent.data);
			}
			
		}
		int data=s.nextInt();
		Node node=new Node(data, null, null);
		this.size++;
		System.out.println("does "+data+" has a left child");
		boolean lefc=s.nextBoolean();
		if(lefc)
		{
			node.left=takeinput(s, node, true);
		}
		System.out.println("does "+data+" has a right child");
		boolean ric=s.nextBoolean();
		if(ric)
		{
			node.right=takeinput(s, node, false);
		}
		return node;
		
	}
	
	public void display()
	{
		display(root);
	}
	private void display(Node node)
	{
		if(node.left!=null)
		{
			System.out.print(node.left.data+" ==> ");
		}
		else
		{
			System.out.print("END ==> ");
		}
		System.out.print(node.data);
		if(node.right!=null)
		{
			System.out.print(" <== "+node.right.data);
		}
		else
		{
			System.out.print(" <== END ");
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
	public int size() {
		return this.size;
	}
	public int height() 
	{
		return height(root);
	}
	private int height(Node node)
	{
		if(node==null)
		{
			return -1;
		}
		int lh=height(node.left);
		int rh=height(node.right);
		return Math.max(lh, rh)+1;
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
	public ArrayList<ArrayList<Integer>> arraylistoflevels()
	{
		ArrayList<Integer> templist=new ArrayList<>();
		ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
		LinkedList<Node> queue=new LinkedList<>();
		
		queue.addLast(root);
		Node lastnode=this.root;
		while(!queue.isEmpty())
		{
			
			Node node=queue.removeFirst();
			templist.add(node.data);
			if(node.left!=null)
			{
				queue.addLast(node.left);
				
			}
			if(node.right!=null)
			{
				queue.addLast(node.right);
				
			}
			if(node==lastnode)
			{
				mainlist.add(templist);
				templist=new ArrayList<>();
				if(node.right==null&node.left!=null)
				{
					lastnode=node.left;
				}
				else
				{
					lastnode=node.right;
				}
			}
			
		}
		return mainlist;
		
		
	}
	public boolean isbalanced()
	{
		return this.isbalanced(this.root);
	}
	private boolean isbalanced(Node node)
	{
		if(node==null)
		{
			return true;
		}
		int leftsubtree=height(node.left);
		int rightsubtree=height(node.right);
		int diff=leftsubtree-rightsubtree;
		if(diff<=1)
		{
			boolean leftans=isbalanced(node.left);
			if(!leftans)
			{
				return false;
			}
			else
			{
				return isbalanced(node.right);
			}
		}
		else
		{
			return false;
		}
		
	}
	public int sumofallnodes()
	{
		 return sumofallnodes(this.root);
	}
	private int sumofallnodes(Node node)
	{
		if(node==null)
		{
			return 0;
		}
		int left=sumofallnodes(node.left);
		int right=sumofallnodes(node.right);
		int ans=node.data+left+right;
		return ans;
		
		
	}

	public void levelorderzigzag()
	{
		ArrayList<ArrayList<Integer>> mainlist=arraylistoflevels();
		for(int i=0;i<=mainlist.size()-1;i++)
		{
			ArrayList<Integer>templist=mainlist.get(i);
			if(i%2==1)
			{
				for(int j=templist.size()-1;j>=0;j--)
				{
					System.out.print(templist.get(j)+" ");
				}
			}
			else
			{
				for(int j=0;j<=templist.size()-1;j++)
				{
					System.out.print(templist.get(j)+" ");
				}
			}
		}
		System.out.println();
	}
	public void levelordernewline()
	{
		ArrayList<ArrayList<Integer>> mainlist=arraylistoflevels();
		for(int i=0;i<=mainlist.size()-1;i++)
		{
			ArrayList<Integer>templist=mainlist.get(i);
			for(int j=0;j<=templist.size()-1;j++)
			{
				System.out.print(templist.get(j)+" ");
			}
			System.out.println();	
		}
	}
	public void removeleafnode()
	{
		removeleafnode(this.root,null,true);
	}
	private void removeleafnode(Node node,Node parent, boolean isleft)
	{
		if(node==null)
		{
			return;
		}
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
		removeleafnode(node.left, node, true);
		removeleafnode(node.right, node, false);
	}

//	public void lowestcommonancestors(int d1,int d2)
//	{
//		
//		Node node=lowestcommonancestors(this.root,d1, d2);
//		System.out.println(node.data);
//	}
//	private Node lowestcommonancestors(Node node,int d1,int d2)
//	{
//		if(node==null)
//		{
//			return null;
//		}
//		if(node.data==d1||node.data==d2)
//		{
//		    return node;	
//		}
//		Node leftanc=lowestcommonancestors(node.left, d1, d2);
//		Node rightanc=lowestcommonancestors(node.right, d1, d2);
//		if(leftanc==null&&rightanc!=null)
//		{
//			return rightanc;
//		}
//		else if(leftanc!=null&&rightanc==null)
//		{
//			return rightanc;
//		}
//		else
//		{
//			return node;
//		}
//	}
	
	public void roottoleaf(int k)
	{
		ArrayList<Integer> ans=new ArrayList<>();
		roottoleaf(k, root, ans, k);
		for (int i = ans.size()-1; i >=0; i--) {
			System.out.print(ans.get(i)+" ");
		}
		
		
	}
	private boolean isleafnode(Node node)
	{
		if(node.left==null&&node.right==null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	private boolean roottoleaf(int k,Node node,ArrayList<Integer> ans,int req)
	{
		boolean leftans=false;
		boolean rightans=false;
		if(isleafnode(node))
		{
			if(node.data==req)
			{
				ans.add(node.data);
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			if(node.left!=null)
			{
	            leftans=roottoleaf(k, node.left, ans, req-node.data);
			}
			if(node.right!=null)
			{
	             rightans=roottoleaf(k, node.right, ans, req-node.data);
			}
	         if(!leftans&&!rightans)
	          {
	    	       return false;
	          }
	          else
	          {
	    	       ans.add(node.data);
	    	       return true;
	          }
		}
	}
	public void siblings()
	{
		ArrayList<Integer>ans=new ArrayList<>();
		siblings(this.root,null,ans,false);
		for(int i=0;i<=ans.size()-1;i++)
		{
			System.out.print(ans.get(i)+" ");
		}
		
	}
	private void siblings(Node node,Node parent,ArrayList<Integer>ans,boolean isleft)
	{
		if(parent==null)
		{
			if(node.left!=null)
			{
				siblings(node.left, node, ans, true);
			}
			if(node.right!=null)
			{
				siblings(node.right, node, ans, false);
			}
			return;
		}
		if(isleft)
		{
			if(parent.right==null)
			{
				ans.add(node.data);
			}
		}
		else
		{
			if(parent.left==null)
			{
				ans.add(node.data);
			}
		}
		if(node.left!=null)
		{
			siblings(node.left, node, ans, true);
		}
		if(node.right!=null)
		{
			siblings(node.right, node, ans, false);
		}
		
		
	}

	public boolean structuallysame(binarytree tree2)
	{
		return structuallysame(this.root,tree2.root);
		
		
	}
	private boolean structuallysame(Node node1,Node node2) {
		
		if(node1==null&&node2!=null||node2==null&&node1!=null)
		{ 
			return false;
		}
		if(node1==null&&node2==null)
		{
			return true;
		}
		if(node1.data!=node2.data)
		{
			return false;
		}
		boolean leftans=structuallysame(node1.left, node2.left);
		if(!leftans)
		{
			return false;
		}
		boolean rightans=structuallysame(node1.right, node2.right);
		if(!rightans)
		{
			return false;
		}
		return true;
		
		
		
	}
	public boolean isBst()
	{
		return isBst(this.root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	}
	private boolean isBst(Node node,int min,int max)
	{
		if(node==null)
		{
			return true;
		}
		if(node.data<min||node.data>max)
		{
			return false;
		}
		boolean leftans=isBst(node.left, min,node.data);
		if(!leftans)
		{
			return false;
		}
		boolean rightans=isBst(node.right, node.data, max);
		if(!rightans)
		{
			return false;
		}
		return true;
	}
	
	public int lowestcommonancestor(int d1,int d2)
	{
		return lowestcommonancestor(root,d1,d2).data;
	}
	private Node lowestcommonancestor(Node node,int d1,int d2)
	{
		
		if(node==null)
		{
			return null;
		}
		if(node.data!=d1&&node.data!=d2)
		{
			Node left=lowestcommonancestor(node.left, d1, d2);
			Node right=lowestcommonancestor(node.right, d1, d2);
			if(left==null&&right==null)
			{
				return null;
			}
			if(left!=null&&right!=null)
			{
				return node;
			}
			if(left==null)
			{
				return right;
			}
			if(right==null)
			{
				return left;
			}
			
			
		}
		if(node.data==d1||node.data==d2)
		{
			return node;
		}
		return null;
		
}
	public String trre2str()
	{
		StringBuilder sb=new StringBuilder();
		return tree2str(root,sb);
	}
	
	private String tree2str(Node node,StringBuilder result) {

		if(node==null)
		{
			return "";
		}

		
        
        result.append(node.data);
        if(!isleaf(node))
        {
        result.append("(");
        }
       
        
      tree2str(node.left, result);
      if(!isleaf(node))
      {
      result.append(")");
      }
      if(!isleaf(node)&&node.right!=null)
      {
      result.append("(");
      }
      tree2str(node.right, result);
      if(!isleaf(node)&&node.right!=null)
      {
      result.append(")");
      }
      return result.toString();
    
        
    }
	private boolean isleaf(Node node)
	{
		return node.left==null&&node.right==null;
	}

	
	
	
	
	





}


