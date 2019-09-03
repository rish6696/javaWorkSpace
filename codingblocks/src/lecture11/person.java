package lecture11;

public class person {
	
	private String name;
	private int age;


    person(String name,int age)
    {
    	this.name=name;
    	this.age=age;
    }
    public int getage()
    {
    	return this.age;
    }
    
    public void setage(int age)
    {
    	this.age=age;
    }
    public void setname(String name)
    {
    	this.name=name;
    }
    
    
    public String getname()
    {
    	return this.name;
    }
    


}
