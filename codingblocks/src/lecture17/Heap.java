package lecture17;

import java.util.ArrayList;
import java.util.Collections;

public class Heap<T extends Comparable<T>> {

	private ArrayList<T> data;
	private boolean ismin;

	public Heap()
     {
	        this(false);
	       
     }
	public Heap (boolean ismin)
	{
		this.ismin=ismin;
		data=new ArrayList<>();
		
	}
    public int size()
    {
    	return this.data.size();
    }
	public T getHP()
	{
		return this.data.get(0);
	}
	public void Add( T data)
	{
		this.data.add(data);
		upheapify(this.data.size()-1);
		
		
		
	}
	private void upheapify(int ci)
	{
		
		if(ci==0)
		{
			return;
		}
		int pi=(ci-1)/2;
		if(isneeded(ci,pi)==true)
		{
			swap(ci,pi);
			upheapify(pi);
		}
		else
		{
			return;
		}
		
	}
	private boolean isneeded(int ci,int pi)
	{
		T cd=data.get(ci);
		T pd=data.get(pi);
		if(this.ismin==true)
		{
			if(pd.compareTo(cd)<0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			if(pd.compareTo(cd)<0)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		
	}
	private void swap(int ci,int pi)
	{
	       Collections.swap(this.data, ci, pi);
	       
		
	}
	public void display()
	{
	    this.display(0);
	}
	public void display(int index) {
		
		int lc=2*index+1;
		int rc=2*index+2;
		
		if(lc>this.data.size()-1)
		{
			System.out.print("END=>");
		}
		else
		{
			System.out.print(this.data.get(lc)+"=>");
		}
		System.out.print(this.data.get(index));
		if(rc>this.data.size()-1)
		{
			System.out.print("<=END");
		}
		else
		{
			System.out.print("<="+this.data.get(rc));
		}
		System.out.println();
		if(lc<this.data.size()-1)
		{
			display(lc);
		}
		if(rc<this.data.size()-1)
		{
			display(rc);
		}
		
		
		
		
		
		
	}
	
	public T remove()
    { 
		T rv= this.getHP();
		swap(0, this.data.size()-1);
		this.data.remove(this.data.size()-1);
		downheapify(0);
		return rv;
    }
	public void downheapify(int pi)
	{
		
		int lci=2*pi+1;
		int rci=2*pi+2;
		int mi=pi;
		if(isneeded(lci, pi)&&lci<this.data.size()-1)
		{
			mi=lci;
		}
		if(isneeded(rci, pi)&&rci<this.data.size()-1)
		{
			mi=rci;
		}
		if(mi!=pi)
		{
			downheapify(mi);
		}
		
		
	
		
		
	}
	
	
		

	
	


	
	
}
