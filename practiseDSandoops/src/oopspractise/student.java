package oopspractise;

public class student implements Comparable<student> {
	private int  roll;
	 private String name;
	 private int percentage;
	public student(int roll,String name,int percentage)
	{
		this.roll=roll;
		this.name=name;
		this.percentage=percentage;
		
	}
	public static final int totalstudents=1000;
	public  static String uniformcolour="blue"; 
	
	
	
	
	public int getRoll() {
		return roll;
	}




	public void setRoll(int roll) {
		this.roll = roll;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getPercentage() {
		return percentage;
	}




	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}




	public String toString()
	{
		String m="name:"+this.name+" roll:"+this.roll+" percentage:"+this.percentage;
		return m;
	}
	


	@Override
	public int compareTo(student o) {
		// TODO Auto-generated method stub
		return o.percentage-this.percentage;
	}
	public static void astaticfunction()
	{
		System.out.println(student.uniformcolour);
		System.out.println(student.totalstudents);
		
	}
	public void anonstaticfunction()
	{
		System.out.println(this.name);
		System.out.println(this.roll);
	}
	


}
