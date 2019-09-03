package Heap;

import java.util.ArrayList;

public class heapclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		student[] arr=new student[11];
//		arr[0]=new student(401,"yamini"	,73);
//		arr[1]=new student(402,"sparsh",70);
//		arr[2]=new student(403,"himanshu gaba",69);
//		arr[3]=new student(404,"Rishabh sharma",80);
//		arr[4]=new student(405,"Bhoomika",74);
//		arr[5]=new student(406,"Chirag bhasin",68);
//		arr[6]=new student(407,"shivansh",71);
//		arr[7]=new student(408,"Manthan gupta",73);
//		arr[8]=new student(409,"anubhav",61);
//		arr[9]=new student(410,"Atul",67);
//		arr[10]=new student(411,"Diksha sharma",79);
//		Heap<student>heap=new Heap<heapclient.student>(arr, false);
//		heap.display();
//		System.out.println("*****************************************************");
//		System.out.println(heap.gethpriority());
		
		
		
		
		
//		Heap<student> heap=new Heap<student>();
//		heap.add(new student(404, "rishabh", 80));
//		heap.add(new student(413, "diksha mittal", 80));
//		heap.add(new student(414, "shivansh", 72));
//		heap.add(new student(403, "himanshu gaba", 69));
//		heap.display();
//		System.out.println("************************************");
//		System.out.println(heap.gethpriority());
//		heap.remove();
//		System.out.println("***************************************");
//		heap.display();
//		System.out.println("*************************************");
//		System.out.println(heap.gethpriority());
//		
		
//	   Heap<Integer> heap=new Heap<Integer>(false);
//	   heap.add(50);
//	   heap.add(40);
//	   heap.add(45);
//	   heap.add(30);
//	   heap.add(20);
//	   heap.add(15);
//	   heap.add(25);
//	   heap.display();
//	   heap.remove();
//	   System.out.println("*******************************************");
//	   heap.display();
	   Integer[]aray =new Integer[10];
	   aray[0]=10;
	   aray[1]=10;
	   aray[2]=10;
	   Heap heap=new Heap<Integer>(aray, false);
	   System.out.println(heap.gethpriority());
	  

	}


private static  class student implements Comparable<student> {
	int roll;
	String name;
	int percentage;
	public student(int roll,String name,int percentage)
	{
		this.roll=roll;
		this.name=name;
		this.percentage=percentage;
		
	}
	
	
	
	public String toString()
	{
		String m="{name:"+this.name+" roll:"+this.roll+" percentage:"+this.percentage+"}";
		return m;
	}
	


	@Override
	public int compareTo(student o) {
		// TODO Auto-generated method stub
		return this.percentage-o.percentage;
	}


}}

