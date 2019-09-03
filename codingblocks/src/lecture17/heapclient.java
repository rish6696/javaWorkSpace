package lecture17;

public class heapclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Heap heap=new Heap<Integer>(true);
		heap.Add(90);
		heap.Add(80);
		heap.Add(700);
		heap.Add(60);
		heap.Add(50);
		heap.Add(40);
		heap.Add(30);
		heap.Add(20);
		heap.display();
		heap.remove();
		System.out.println("***********************");
		heap.display();
		
		
	
		

	}
	
	private static class Student implements Comparable<Student> {
		int marks;
		int rank;
		String name;

		Student(int marks, int rank, String name) {
			this.marks = marks;
			this.rank = rank;
			this.name = name;
		}

		public String toString() {
			return "{Name=" + this.name + ", Marks=" + this.marks + ", Rank=" + this.rank + "}";
		}

		@Override
		public int compareTo(Student o) {
			// TODO Auto-generated method stub
			return this.marks - o.marks;
		}

	}



}
