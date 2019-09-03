package hashmap;


import java.util.ArrayList;



import linkedlist.linkedlistclient;

public class Hashmap<k,v> {
	
	public class HTpair<k,v>
	{
		k key;
		v value;
		public HTpair(k key, v value)
		{
			this.key=key;
			this.value=value;
		}
		public boolean equals(Object other)
		{
			HTpair op=(HTpair)other;
			return this.key.equals(op.key);
		}
		public String toString()
		{
			String m=this.key+"="+this.value;
			return m;
			
		}
	}
	private LinkedList<HTpair> [] bucketaraay;
	private int size;
	public static final int default_capacity=10;
	public Hashmap() {
		this(default_capacity);
	}
	public Hashmap(int capacity)
	{
		this.bucketaraay=(LinkedList<HTpair>[])new LinkedList[capacity];
		this.size=0;
	}
	
	public void put(k key,v value)throws Exception
	{
		int bi=hashfunction(key);
		HTpair pta=new HTpair(key, value);
		
		LinkedList<HTpair> bucket=bucketaraay[bi];
		if(bucket==null)
		{
			bucket=new LinkedList<>();
			bucket.addLast(pta);
			this.size++;
			bucketaraay[bi]=bucket;
		}
		else
		{
			int findat=bucket.find(pta);
			if(findat==-1)
			{
				bucket.addLast(pta);
				this.size++;
			}
			else
			{
				HTpair pair=bucket.getAt(findat);
				pair.value=value;
				
			}
			
			
		}
//		double lambda=(this.size*1.0)%this.bucketaraay.length;
//		if(lambda>0.75)
//		{
//			this(rehash);
//		}
		
		double lamda=(this.size*1.0)/this.bucketaraay.length;
		if(lamda>0.75) {
			this.rehash();
		}
		
	}
	private int hashfunction(k key)
	{
		int hc=key.hashCode();
		hc=Math.abs(hc);
		int bi=hc%bucketaraay.length;
		return bi;
	}
	public void display()
	{
		for(LinkedList<HTpair> bucket:this.bucketaraay)
		{
			if(bucket!=null&&!bucket.isEmpty())
			{
				bucket.display();
			}
			else
			{
				System.out.println("NULL");
			}
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
		System.out.println("***********************************");
	}
	public v get(k key)throws Exception
	{
		int bi=hashfunction(key);
		HTpair<k,v> ptf=new HTpair(key, null);
		
		LinkedList<HTpair> bucket=bucketaraay[bi];
		if(bucket==null)
		{
			return null;
		}
		else
		{
			int findat=bucket.find(ptf);
			if(findat==-1)
			{
				return null;
			}
			else
			{
				HTpair<k,v> pair=bucket.getAt(findat);
				return pair.value;
				
			}
			
			
		}
		
		
		
	}
	public v remove(k key)throws Exception
	{
		int bi=hashfunction(key);
		HTpair<k,v> ptf=new HTpair(key, null);
		
		LinkedList<HTpair> bucket=bucketaraay[bi];
		if(bucket==null)
		{
			return null;
		}
		else
		{
			int findat=bucket.find(ptf);
			if(findat==-1)
			{
				return null;
			}
			else
			{
				
				 HTpair<k,v> pair=bucket.getAt(findat);
				 bucket.removeAt(findat);
				 this.size--;
				 return pair.value;
				
				
			}
			
			
		}
		
		
	}
	private void rehash() throws Exception {
		LinkedList<HTpair>[] oba=this.bucketaraay;
		this.bucketaraay=(LinkedList<HTpair>[])new LinkedList[2*oba.length];
		for(LinkedList<HTpair> ob:oba)
		{
			while(ob!=null&&!ob.isEmpty())
			{
				HTpair<k,v> pair=ob.removeFirst();
				this.put(pair.key, pair.value);
			}
		}
		
		
	}
	@Override
	public String toString(){
		// TODO Auto-generated method stub
		ArrayList<HTpair<k,v>> displaylist=new ArrayList<>();
		for(LinkedList<HTpair> list:this.bucketaraay)
		{
			if(list!=null&&!list.isEmpty())
			{
				for(int i=0;i<=list.size()-1;i++)
				{
					try {
						displaylist.add(list.getAt(i));
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		System.out.print("{");
		for(int i=0;i<=displaylist.size()-1;i++)
		{
			System.out.print(displaylist.get(i));
			System.out.print(" ");
		}
		System.out.print("}");
		return "";
		
		
	}
	
	  
}	
	
	
	
	
	
	
	

