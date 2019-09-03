package lecture15;



public class BST {
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
    private  Node root;
    private int size;
    
    
    public void add(int data)
    {
    	add(data,root);
    }
    private void add(int data,Node node)
    {
    	if(node==null)
    	{
    		Node temp=new Node(null, null, data);
    		size++;
    		this.root=temp;
    	}
    	else
    	{
    		if(data<node.data)
    		{
    			if(node.left!=null)
    			{
    				add(data,node.left);
    			}
    			else
    			{
    				Node mode=new Node(null, null, data);
    				this.size++;
    				node.left=mode;
    			}
    		}
    		else
    		{
    			if(node.right!=null)
    			{
    				add(data,node.right);
    			}
    			else
    			{
    				Node mode=new Node(null, null, data);
    				this.size++;
    				node.right=mode;
    			}
    		}
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
    public int max()
    {
    	return max(this.root);
    }
    private int max(Node node)
    {
    	if(node.right==null)
    	{
    		return node.data;
    	}
    	
    		return max(node.right);
   }
    public int min()
    {
    	return min(this.root);
    }
    private int min(Node node)
    {
    	if(node.left==null)
    	{
    		return node.data;
    	}
    	
    		return min(node.left);
   }
    
   public void remove(int data)
   {
	   remove(this.root,data,null);
   }
   private  void remove(Node node,int data,Node parent)
   {
	   if(data<node.data)
	   {
		   remove(node.left, data,node);
	   }
	   else if(data>node.data)
	   {
		   remove(node.right, data,node);
	   }
	   else
	   {
		   if(node.right==null&&node.left==null)
		   {
			   if(parent.right.data==data)
			   {
				   parent.right=null;
				   size--;
				   
			   }
			   else
			   {
				   parent.left=null;
				   size--;
			   }
		   }
		   else if(node.left==null)
		   {
			   if(parent.right.data==data)
			   {
				   parent.right=node.right;
				   
			   }
			   else
			   {
				   parent.left=node.right;
			   }
			   
		   }
		   else if(node.right==null)
		   {
			   if(parent.right.data==data)
			   {
				   parent.right=node.left;
				   
			   }
			   else
			   {
				   parent.left=node.left;
			   }
		   }
		   else
		   {
			   int lmax=max(node.left);
			   remove(lmax);
			   node.data=lmax;
			   
			 }
		   
		   
	   }
	   
	   
   }
    }
