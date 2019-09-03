package lecture13;

public class Linkedlist {
	private class Node {
		int data;
		Node next;

		public Node(int data,Node  next) {
			this.data=data;
			this.next=next;

		}

	}

	Node head;
	Node tail;
	int size;
	public Linkedlist()
	{
		this.head=null;
		this.tail=null;
		this.size=0;
	}
	public int size()
	{
		return size;
	}
	public boolean isEmpty()
	{
		if (this.size==0) {
			return true;
			
		}
		else
		{
			return false;
		}
	}
	public void addfirst(int data)
	{
		if(size()==0)
		{
			Node node=new Node(data, null);
			size++;
		}
		else
		{
			Node node=new Node(data,this.head);
			this.head=node;
			size++;
		}
		
		
	}
	public void addlast(int data) {

		Node node=new Node(data, null);
		this.tail.next=node;
		this.tail=node;
		size++;
		
		
	}
    public Node getnodeAt(int index) throws Exception{
    	if(size()==0)
    	{
    		throw new Exception("list is empty");
    	}
    	else if(index<0||index>=size())
    	{
    		throw new Exception("invalid index");
    		
    	}
    	else
    	{
    		int counter=0;
    		Node temp;
    		temp=this.head;
    		while(counter<index)
    		{
    			temp=temp.next;
    			counter++;
    		}
    		return temp;
    	}
    
    	
		
	}   
    public void addAt(int data ,int index) throws Exception 
    { 
    	if(index<0||index>size)
	  {
		throw new Exception("invalid index");
		
	  }
    	if(size()==0)
    	{
    		this.addfirst(data);
    		size++;
    	}
    	
    	else if(index==size)
    	{
    		this.addlast(data);
    		size++;
    	}
    	else
    	{
    		Node temp=this.getnodeAt(index-1);
    		Node node=new Node(data,temp.next);
    		temp.next=node;
        
        	size++;
    	}
    	
    	
    	
    	
    }
    public int getfirst() throws Exception
    {
    	return getnodeAt(0).data;
    }
    public int getlast() throws Exception
    {
    	return this.tail.data;
    }
    public int getAt(int index) throws Exception
    {
    	return getnodeAt(index).data;
    }
    public void removefirst() throws Exception
    {
    	this.head=this.head.next;
    	this.size--;
    }
    public void removelast()
    {
    	
    }
}
