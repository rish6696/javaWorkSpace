package lecture15;

public class bstclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BST tree=new BST();
		tree.add(50);
		tree.add(25);
		tree.add(75);
		tree.add(62);
		tree.add(87);
		tree.add(56);
    	tree.add(12);
    	tree.add(37);
		tree.add(39);
		tree.display();
		System.out.println("*********");
		tree.remove(50);
		tree.display();
		System.out.println("********************");
		tree.remove(39);
		tree.display();
		
		
		
		

	}

}
