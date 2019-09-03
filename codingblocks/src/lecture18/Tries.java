package lecture18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;



public class Tries {
	
	public class Node
	{
		char data;
		HashMap<Character, Node> children;
		boolean isterminal;
		public Node(char data,boolean isterminal)
		{
			this.data=data;
			this.isterminal=isterminal;
			this.children=new HashMap<>();
			
			
		}
		
		
	}
   
	Node root;
	int totalword;
	public Tries()
	{
		this.root=new Node('\0', false);
		this.totalword=0;
	}
	
	public void display()
	{
		this.display(root,"");
	}
	private void display(Node node,String output)
	{

		if (node.isterminal) {
			String toprint = output.substring(1) + node.data;
			System.out.println(toprint);
		}
		
		
		
		Set<Map.Entry<Character, Node>> entries=node.children.entrySet();
		for(Map.Entry<Character, Node> entry:entries)
		{
			
			display(entry.getValue(),output+node.data);
		}
		
		
	}
	
	public void add(String word)
	{
		this.add(word,this.root);
	}
	private void add(String word,Node node)
	{
		if(word.length()==0)
		{
			return;
		}
		char cc=word.charAt(0);
		String ros=word.substring(1);
		
		if(node.children.containsKey(cc))
		{
			Node temp=node.children.get(cc);
			add(ros, temp);
		}
		else
		{
			Node mode=new Node(cc, ros.length()==0);
			node.children.put(cc, mode);
			add(ros, mode);
		}
		
	}
	
	public boolean search(String word)
	{
		return search(root,word);
	}
	private boolean search(Node node,String word)
	{
		if(word.length()==0)
		{
			return true;
		}
		char cc=word.charAt(0);
		String ros=word.substring(1);
		
		if(node.children.containsKey(cc))
		{
			Node temp=node.children.get(cc);
			return search(temp, ros);
			
		}
		else
		{
			return false;
		}
		
	}
    public  void remove(String word) {
		
    	this.remove(root,word);
	}
    private void remove(Node node,String word) {
    	if(word.length()==0)
    	{
    		return;
    	}
    	
    	char cc=word.charAt(0);
    	String ros=word.substring(1);
    	if(node.children.containsKey(cc));
    	{
    		Node temp=node.children.get(cc);
    		if(temp.isterminal&&ros.length()==0)
    		{
    			node.children.get(cc).isterminal=false;
    			
    		}
    		remove(temp,ros);
    		
    	}
		
	}
	
}
