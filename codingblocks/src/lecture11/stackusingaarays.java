package lecture11;

public class stackusingaarays {

	int[] data;
	int tos;
	public static final int defaut_size = 10;

	public stackusingaarays() throws Exception {
		this(defaut_size);
	}

	public stackusingaarays(int capacity) throws Exception {
		if (capacity < 0) {
			throw new Exception("Invalid capacity");

		}
		this.data = new int[capacity];
		this.tos = -1;

	}

	public int size() {
		return this.tos+1;
	}

	public boolean IsEmpty() {
		if (this.size() == 0) {
			return true;

		} else {
			return false;
		}
	}

	public void push(int value) throws Exception {
		if (size() == data.length) {
			throw new Exception("stack is full");

		}
		this.tos=this.tos+1;
		this.data[this.tos] = value;

	}

	public int pop() throws Exception {
		if (size() == 0) {
			throw new Exception("stack is empty");
		}
		int rev = this.data[this.tos];
		this.data[this.tos] = 0;
		this.tos--;
		return rev;

	}

	public int top() throws Exception {
		if (size() == 0) {
			throw new Exception("stack is empty");

		}
		int rev = this.data[this.tos];
		return rev;

	}

	public void show() throws Exception {
		if (size() == 0) {
			throw new Exception("stack is empty");

		}
		for (int i = 0; i<=this.tos; i++) {
			System.out.print(this.data[i] + " ");

		}
		System.out.println("end");

	}
	public int get(int index)throws Exception
	{
		if(index<0||index>=this.size())   
		{       
			throw new Exception("invalid index");
		}
		return this.data[index];
		
	
	}
	

}
