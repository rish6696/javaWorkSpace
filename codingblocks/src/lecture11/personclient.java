package lecture11;

public class personclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person obj1=new person("rishabh",40);
		person m=new person("neena",50);
	
//		System.out.println(obj1.getage());
//		System.out.println(obj1.getname());
		System.out.println(m.getage());
		m.setage(87);
		System.out.println(m.getage());

	}

}
