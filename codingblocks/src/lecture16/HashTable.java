package lecture16;

public class HashTable<k,v> {
	
	private class HTpair
	{
		k key;
		v value;
		  private HTpair(k key,v value) {
			this.key=key;
			this.value=value;
			
		}
		public boolean equals(Object other)
		{
			HTpair op=(HTpair) other;
			return key.equals(op.key);
			
		}
		public String toString() {
		return "{" + this.key + ":" + this.value + "}";
	}
	}
    
	private linkedlistmyself<HTpair> [] bucketarray;
	private int size;
	public static final int default_capacity=10;
	
	public HashTable() {
		// TODO Auto-generated constructor stub
		this(default_capacity);
	}
	
	public HashTable(int capacity)
	{
		
		this.bucketarray=(linkedlistmyself<HTpair>[]) new linkedlistmyself[capacity];
		this.size=0;
	}
	private int hashFunction(k key)
	{
		int hc=key.hashCode();
		hc=Math.abs(hc);
		int bi=hc%(this.bucketarray.length);
		return bi;
	}
	public void put(k key,v value)throws Exception
	{
		int bi=this.hashFunction(key);
		linkedlistmyself<HTpair> bucket=this.bucketarray[bi];
		HTpair pta=new HTpair(key, value);
		if(bucket==null)
		{
			bucket=new linkedlistmyself<>();
			bucket.addlast(pta);
			this.size++;
			this.bucketarray[bi]=bucket;
		}
		else
		{
			int findAt=bucket.find(pta);
			if(findAt==-1)
			{
				bucket.addlast(pta);
				this.size++;
			}
			else
			{
				HTpair pair=bucket.getAt(findAt);
				pair.value=value;
			}
			
			
		}
		
	}
	public void display()
	{
		for(linkedlistmyself<HTpair> bucket:this.bucketarray)
		{
			if(bucket!=null&&!bucket.isEmpty())
			{
				bucket.display();
				
			}
			else
			{
				System.out.println("NULL");
			}
			System.out.println("--------------------------------");
		}
		System.out.println("****************************");
	}
	
	public v get(k key)throws Exception
	{
		
		int bi=this.hashFunction(key);
		linkedlistmyself<HTpair> bucket;
		bucket=this.bucketarray[bi];
		HTpair ptg=new HTpair(key,null);
		if (bucket==null) {
			return null;
			
		}
		else
		{
			int findat =bucket.find(ptg);
			if(findat==-1)
			{
				return null;
			}
			else
			{
				HTpair pair=bucket.getAt(findat);
				return pair.value;
				
			}
			
		}
		
	}
	public v remove(k key)throws Exception
	{
		
		int bi=this.hashFunction(key);
		linkedlistmyself<HTpair> bucket;
		bucket=this.bucketarray[bi];
		HTpair ptg=new HTpair(key,null);
		if (bucket==null) {
			return null;
			
		}
		else
		{
			int findat =bucket.find(ptg);
			if(findat==-1)
			{
				return null;
			}
			else
			{
				HTpair pair=bucket.getAt(findat);
				bucket.removeAt(findat);
				this.size--;
				return pair.value;
				
				
			}
			
		}
		
	}


}
