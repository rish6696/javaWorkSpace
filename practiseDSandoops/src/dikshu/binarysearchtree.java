package dikshu;



public class binarysearchtree {
	
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
    Node root;
    int size;
    public binarysearchtree() {
		this.root=null;
		this.size=0;
		
	}
    public void add(int data)
    {
    	Node node=new Node(data, null, null);
    	this.size++;
    	if(size()==1)
    	{
    		this.root=node;
    	}
    	else
    	{
    		add(node,this.root);
    	}
    	
    	
    	
    }
    private void add(Node nodetoadd,Node node)
    {
    	if(nodetoadd.data<node.data)
    	{
    		if(node.left==null)
    		{
    			node.left=nodetoadd;
    		}
    		else
    		{
    			add(nodetoadd, node.left);
    		}
    	}
    	else
    	{
    		if(node.right==null)
    		{
    			node.right=nodetoadd;
    			
    		}
    		else
    		{
    			add(nodetoadd, node.right);
    		}
    	}
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
}
