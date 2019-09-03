package lecture13;

import java.util.Scanner;

public class linkedlistmyself {
	Scanner s=new Scanner(System.in);
	public class Node {
		int data;
		Node next;

		Node(int data, Node next) {
			this.data = data;
			this.next = next;

		}
	}

	int size;
	Node head;
	Node tail;

	public linkedlistmyself() {

		// TODO Auto-generated constructor stub
		this.size = 0;
		this.head = null;
		this.tail = null;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		if (size() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public void addfirst(int data) {
		if (size() == 0) {
			Node node = new Node(data, null);
			this.head = node;
			this.size++;

		} else {
			Node node = new Node(data, this.head);
			this.head = node;
			this.size++;
		}
	}

	public void addlast(int data) {
		Node node = new Node(data, null);
		if (isEmpty()) {
			this.tail = node;
			this.head = node;
		} else {
			this.tail.next = node;
			this.tail = node;
		}
		this.size++;

	}

	public Node getnodeAt(int index) throws Exception {
		if (index < 0 || index >= size()) {
			throw new Exception("invalid index");
		}

		Node temp = this.head;
		int counter = 0;
		while (counter < index) {

			temp = temp.next;
			counter++;

		}
		return temp;
	}

	public void addAt(int index, int data) throws Exception {
		if (index < 0 || index > size()) {
			throw new Exception("invalid index");
		} else if (index == size()) {
			addlast(data);

		} else if (index == 0) {
			addfirst(data);

		} else {
			Node temp = getnodeAt(index - 1);
			Node node = new Node(data, temp.next);
			temp.next = node;
			this.size++;
		}
	}

	public int getFirst() throws Exception {
		if (size() == 0) {
			throw new Exception("list is empty");

		}
		return this.head.data;

	}

	public int getLast() throws Exception {
		if (isEmpty()) {
			throw new Exception("list is empty");

		}
		return this.tail.data;

	}

	public int getAt(int index) throws Exception {
		if (index < 0 || index >= size()) {
			throw new Exception("invalid index");

		}
		return this.getnodeAt(index).data;

	}

	public void removeFirst() throws Exception {
		if (isEmpty()) {
			throw new Exception("list is empty");
		} else if (size() == 1) {
			this.head = null;
			this.tail = null;

		} else {
			this.head = this.head.next;
			size--;
		}

	}

	public void removelast() throws Exception {
		if (isEmpty()) {
			throw new Exception("list is empty");
		} else if (size() == 1) {
			this.head = null;
			this.tail = null;

		} else {
			this.tail = getnodeAt(size() - 2);
			this.tail.next = null;
			this.size--;
		}
	}

	public void removeAt(int index) throws Exception {
		if (isEmpty()) {
			throw new Exception("list is empty");
		} else if (index < 0 || index >= size()) {
			throw new Exception("invalid index");
		} else if (index == 0) {
			removeFirst();
		} else if (index == size() - 1) {
			removelast();
		}

		else {
			Node temp = getnodeAt(index - 1);
			temp.next = temp.next.next;
			this.size--;

		}
	}

	public void display() {
		Node node = this.head;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;

		}

	}

	public void reverseDI() throws Exception {
		int n = 1, temp, i = 0, j = this.size() - 1;
		while (n <= size() / 2) {
			temp = getnodeAt(i).data;
			getnodeAt(i).data = getnodeAt(j).data;
			getnodeAt(j).data = temp;
			i++;
			j--;
			n++;
		}

	}

	public void sort() throws Exception {

		int i, j, temp;
		for (i = 1; i < this.size() - 1; i++) {
			for (j = 0; j < this.size() - i; j++) {
				if (this.getAt(j) > this.getAt(j + 1)) {
					temp = this.getAt(j);
					this.getnodeAt(j).data = this.getnodeAt(j + 1).data;
					this.getnodeAt(j + 1).data = temp;
				}
			}

		}

	}
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


