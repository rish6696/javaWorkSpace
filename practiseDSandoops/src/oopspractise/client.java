package oopspractise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student s1=new student(404, "rishabh", 80);
		//System.out.println(s1);
		ArrayList<student> list=new ArrayList<>();
		list.add(new student(55,"diksha", 98));
		list.add(new student(23, "dishu", 55));
		list.add(new student(41, "rahul", 76));
		
		Collections.sort(list);
		for(student l:list)
		{
			System.out.println(l);
		}
		System.out.println(student.uniformcolour);
		
		student.astaticfunction();
		s1.anonstaticfunction();
		
		

	}

}
