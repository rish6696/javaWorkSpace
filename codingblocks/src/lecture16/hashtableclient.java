package lecture16;

import java.util.ArrayList;

public class hashtableclient {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
//		ArrayList<Integer> list=new ArrayList<>();
//		//list.add(98);
//		System.out.println(list.isEmpty());
		HashTable<String, Integer> map=new HashTable<>();
		map.put("India", 250);
		map.put("russia", 51);
		map.put("India", 350);
		map.put("australia", 45);
		map.put("pak", 88);
		map.put("france", 111111);
		map.display();
		
		System.out.println(map.get("russia"));
		map.remove("pak");
		map.display();
//		map.remove("france");
//		map.display();
		
		


		

	}

}
