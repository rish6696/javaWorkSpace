package hashmap;

public class hashmapclient {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Hashmap<String, Integer> map=new Hashmap<>(5);
		map.put("india", 35023);
		map.put("pak", 350);
    	map.put("china", 350);
		map.put("nepal", 350);
		map.put("bhutan", 350);
		System.out.println(map);
		map.remove("india");
		System.out.println(map);
		map.put("australai", 780);
		System.out.println(map);
		map.remove("nepal");
		System.out.println(map);
		
		
//		map.display();
//		System.out.println(map.get("china"));
//		System.out.println(map.get("india"));
//		map.remove("bhutan");
//		map.display();
//		

	}

}
