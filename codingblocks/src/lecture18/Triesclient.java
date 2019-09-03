package lecture18;

public class Triesclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tries dictionary=new Tries();
		dictionary.add("art");
		dictionary.add("arts");
		dictionary.add("artts");
		dictionary.add("bug");
		dictionary.add("rishabh");
		dictionary.add("hello");
		dictionary.add("helooooooo");
		dictionary.add("mlloooopppppp");
		dictionary.add("yellow");
	//	System.out.println(dictionary.totalword);
		
		dictionary.display();
		System.out.println("****************************************");
//        System.out.println(dictionary.search("hello"));
//		System.out.println(dictionary.search("bug"));
//		System.out.println(dictionary.search("myworldd"));
//		System.out.println(dictionary.search("army"));
		dictionary.remove("artts");
		dictionary.remove("yellow");
		dictionary.display();
	}

}
