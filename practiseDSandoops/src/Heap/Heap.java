package Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class Heap <T extends Comparable<T>>{
	ArrayList<T> data;
	boolean ismin;
	
	
	public Heap() {
		this(false);
	}
	public Heap(T[] items,boolean ismin)
	{
		this(ismin);
		for(T item:items)
		{
			this.data.add(item);
		}
		for(int i=this.data.size()/2-1;i>=0;i--)
		{
			this.downheapify(i);
		}
	}
	
	public Heap(boolean ismin) {
		this.ismin=ismin;
		this.data=new ArrayList<>();
		
	}
	public T gethpriority()
	{
		return this.data.get(0);
	}
	public int size()
	{
		return this.data.size();
	}
	public void add(T data)
	{
		this.data.add(data);
		upheapify(this.size()-1);
	}
	private void upheapify(int ci)
	{
		if(ci==0)
		{
			return;
		}
		int pi=(ci-1)/2;
		if(this.ismin&&parentgreaterthanchild(pi, ci))
		{
			swap(pi, ci);
			upheapify(pi);
		}
		if(!this.ismin&&!parentgreaterthanchild(pi, ci))
		{
			swap(pi, ci);
			upheapify(pi);
		}
		
	}
	private boolean parentgreaterthanchild(int pi,int ci)
	{
		if(this.data.get(pi).compareTo(this.data.get(ci))>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	private void swap(int pi,int ci)
	{
		Collections.swap(data, pi, ci);
	}
	public void display()
	{
		display(0);
	}
	private void display(int pi) {
		
		
		if(pi==this.data.size())
		{
			return;
		}
		int lci=2*pi+1;
		int rci=2*pi+2;
		if(lci>this.data.size()-1)
		{
			System.out.print("END========>");
		}
		else
		{
			System.out.print(this.data.get(lci)+"=========>");
		}
		System.out.print(this.data.get(pi));
		if(rci>this.data.size()-1)
		{
			System.out.print("<========END");
		}
		else
		{
			System.out.print("<========="+this.data.get(rci));
		}
		System.out.println();
		if(lci<=this.data.size()-1)
		{
			display(lci);
		}
		if(rci<=this.data.size()-1)
		{
			display(rci);
		}
		
		
	}
	public T remove()
	{
		T rv=this.data.get(0);
		swap(0, this.data.size()-1);
		this.data.remove(this.data.size()-1);
		downheapify(0);
		return rv;
		
	}
	private void downheapify(int pi)
	{
		int lci=2*pi+1;
		int gi=pi;
		if(lci<=this.data.size()-1)
		{
			 gi=greateroftwoindex(pi, lci);
	    }
		int rci=2*pi+2;
		if(rci<=this.data.size()-1)
		{
			gi=greateroftwoindex(gi, rci);
		}
		if(gi!=pi)
		{
			swap(pi, gi);
			downheapify(gi);
		}
		
	

    }
	private int greateroftwoindex(int pi,int ci)
	{
		if(this.data.get(pi).compareTo(this.data.get(ci))>0)
		{
			return pi;
		}
		else
		{
			return ci;
		}
	}
}

