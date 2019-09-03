package lecture7;

public class rgerg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="(hello)";
		//System.out.println(str.charAt(0));
		StringBuilder ans=new StringBuilder();
		ans.append(str);
		System.out.println(ans);
		String sub=ans.substring(0,5);
		System.out.println(sub);
		
		char m=')',p='(';
		int n=m,x=p;
		System.out.println(n);
		System.out.println(x);
	}

}
