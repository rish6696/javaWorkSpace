package queue;

public class queusingarray {
	private int[]data;
	private int size;
	private int front;
	private static final int defaultsize=10;
	public queusingarray() {
		// TODO Auto-generated constructor stub
		this(defaultsize);
		
	}
	public queusingarray(int capacity)
	{
		this.data=new int[capacity];
        this.size=0;
        this.front=0;
	}
	public int size()
	{
		return this.size;
	}
	public boolean isempty()
	{
		return this.size==0;
	}
	public void enqueue(int value)throws Exception
	{
		if(this.size()==this.data.length)
		{
			throw new Exception("queue is full");
		}
		int ai=(this.front+this.size())%this.data.length;
		this.data[ai]=value;
		this.size++;
		
	}
	public int dequeue()
	{
		int rev=this.data[front];
		this.data[front]=0;
		this.front=(this.front+1)%this.data.length;
		this.size--;
		return rev;
	}
	public void display()
	{
		for(int i=0;i<=this.size()-1;i++)
		{
			int di=(this.front+i)%this.data.length;
			System.out.print(this.data[di]+" ");
		}
		System.out.println();
	}

}
