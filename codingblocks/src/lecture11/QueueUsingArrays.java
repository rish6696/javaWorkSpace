package lecture11;

public class QueueUsingArrays {
	int size, front;
	int[] data;
	public static final int default_size = 10;

	public QueueUsingArrays() throws Exception {
		// TODO Auto-generated constructor stub
		this(default_size);
	}

	public QueueUsingArrays(int capacity) throws Exception {
		if (capacity < 1) {
			throw new Exception("invalid capacity");
		}
		this.data = new int[capacity];
		this.size = 0;
		this.front = 0;

	}

	public int size() {
		return this.size;

	}

	public boolean isEmpty() {
		if (this.size == 0) {
			return true;

		} else {
			return false;
		}

	}
	public void enque(int value)throws Exception {
		if(this.size==this.data.length)
		{
			throw new Exception("queue is full");
		}
		int ai=(this.front+this.size)%(this.data.length);
		this.data[ai]=value;
		this.size++;
		
		
	}
	public void display() {
		for (int i = 0; i < this.size; i++) {
			int ai = (this.front + i) % this.data.length;
			System.out.print(this.data[ai] + " ");
		}
		System.out.println("END");
	}

	

}
