package linkedlist;

import java.util.ArrayList;

public class Linkedlist {
	
	public class Node
	{
		int data;
		Node next;
		public Node(int data,Node next)
		{
			this.data=data;
			this.next=next;
		}
	}
    
	private Node head;
	private Node tail;
	private int size;
	public Linkedlist()
	{
		this.head=null;
		this.tail=null;
		this.size=0;
	}

	public int size()
	{
		return this.size;
	}
    public boolean isEmpty()
    {

    	return this.size()==0;
    }
    public void addfirst(int data)
    {
    	Node node=new Node(data, this.head);
    	this.size++;
    	this.head=node;
    	if(this.size()==1)
    	{
    		this.tail=node;
    	}
    	
    }
    public void addlast(int data)
    {
    	Node node=new Node(data, null);
    	this.size++;
    	
    	if(this.size()==1)
    	{
    		this.tail=node;
    		this.head=node;
    	}
    	else
    	{
    		this.tail.next=node;
    		this.tail=node;
    	}
    	
    	
    }
    private Node getnodeat(int index)
    {
    	int counter=1;
    	Node temp=this.head;
    	while(counter<=index)
    	{
    		temp=temp.next;
    		counter++;
    	}
    	return temp;
    }
    public void addat(int data,int index)throws Exception
    {
    	if(index<0||index>this.size())
    	{
    		throw new Exception("invalid index");
    	}
    	Node node=new Node(data, null);
    	Node temp=getnodeat(index-1);
    	node.next=temp.next;
    	temp.next=node;
    	this.size++;
    }
    public int getfirst()throws Exception
    {
    	if(isEmpty())
    	{
    		throw new Exception("list is empty");
    	}
    	return this.head.data;
    }
    public int getlast()throws Exception
    {
    	if(isEmpty())
    	{
    		throw new Exception("list is empty");
    	}
    	return this.tail.data;
    }
    public  int getat(int index)throws Exception
    {
    	if(index<0||index>=this.size())
    	{
    		throw new Exception("inalid index");
    	}
    	Node temp=getnodeat(index);
    	return temp.data;
    }
    public void removefirst()throws Exception
    {
    	if(this.isEmpty())
    	{
    		throw new Exception("list is empty");
    	}
    	this.head=this.head.next;
    	this.size--;
    }
    public void removelast()throws Exception
    {
    	if(this.isEmpty())
    	{
    		throw new Exception("list is empty");
    	}
    	if(this.size()==1)
    	{
    		this.size--;
    		this.head=null;
    		this.tail=null;
    	}
    	else
    	{
    		Node node=getnodeat(this.size()-2);
    		node.next=null;
    		this.tail=node;
    		this.size--;
    	}
    	
    	
    }
    public void removeat(int index)throws Exception
    {
    	if(this.isEmpty())
    	{
    		throw new Exception("list is empty");
    	}
    	if(index<0||index>=this.size())
    	{
    		throw new Exception("inalid index");
    	}
    	if(index==0)
    	{
    		removefirst();
    	}
    	else if(index==this.size()-1)
    	{
    		removelast();
    	}
    	else
    	{
    		Node node=getnodeat(index-1);
        	node.next=node.next.next;
        	this.size--;
    	}
    	
    	
    }
    public void display()throws Exception
    {
    	if(isEmpty())
    	{
    		throw new Exception("list is empty");
    	}
    	Node node=head;
    	while(node!=null)
    	{
    		System.out.print(node.data+" ");
    		node=node.next;
    	}
    	System.out.println();
    	System.out.println("*******************");
    }
    
    public void reverseDI()
    {
    	Node left;
    	Node right;
    	left=this.head;
    	right=this.tail;
    	int coun=this.size()/2;
    	int i=1;
    	while(i<=coun)
    	{
    		int temp=left.data;
    		left.data=right.data;
    		right.data=temp;
    		
    		left=left.next;
    		right=getnodeat(this.size()-i-1);
    		i++;
    	}
    }
    public void reversePI()
    {
    	Node prev=this.head;
    	Node curr=prev.next;
    	while(curr!=null)
    	{
    		Node tempcurr=curr;
    		Node tempprev=prev;
    		prev=curr;
    		curr=curr.next;
    		tempcurr.next=tempprev;
    		
    	}
    	Node temp=this.head;
    	this.head=this.tail;
    	this.tail=temp;
    	this.tail.next=null;
    }
    public int mid()
    {
    	return this.mid(this.head);
    }
    private int mid(Node slow)
    {
        Node fast=slow;
        while(fast.next!=null&&fast.next.next!=null)
        {
        	fast=fast.next.next;
        	slow=slow.next;
        }
        return slow.data;
        
    }
    public int Kthelementfromlast(int k)
    {
    	Node slow=this.head;
    	Node fast=this.head;
    	for(int i=1;i<=k;i++)
    	{
    		fast=fast.next;
    	}
    	while(fast!=null)
    	{
    		fast=fast.next;
    		slow=slow.next;
    	}
    	return slow.data;
    }
   
    public Linkedlist merge(Linkedlist other)
    {
    	Node templist=this.head;
    	Node tempother=other.head;
    	Linkedlist ans=new Linkedlist();
    	while(templist!=null&&tempother!=null)
    	{
    		if(templist.data<=tempother.data)
    		{
    			ans.addlast(templist.data);
    			templist=templist.next;
    		}
    		else
    		{
    			ans.addlast(tempother.data);
    			tempother=tempother.next;
    		}
    	}
    	while(templist!=null)
    	{
    		ans.addlast(templist.data);
			templist=templist.next;
    	}
    	while(tempother!=null)
    	{
    		ans.addlast(tempother.data);
			tempother=tempother.next;
    	}
    	return ans;
    }
    public void qqueries(int q,ArrayList<Integer>qlist)throws Exception
    {   
    	int i=1;
    	int j=0;
    	while(i<=q)
    	{
    		this.removeat(qlist.get(j));
    		this.display();
    		j++;
    		i++;
    	}
    }
    
    public Node mergeKLists(Node[] lists) 
    {
    	Linkedlist ans=new Linkedlist();
    	for(int i=0;i<=lists.length-1;i++)
    	{
    		Node node=lists[i];
    		while(node!=null)
    		{
    			ans.addlast(node.data);
    			node=node.next;
    		}
    	}
    	Sort(ans);
    	return ans.head;
    	
    }
    public void Sort(Linkedlist ans)
    {
       	
    }
    
    
    

}




