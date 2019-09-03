package sqaureandtrinumbers;

public class Stringmanipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="1:30:08 am";
		String ans=gen(str);
		System.out.println(ans);

	}
	public static String gen(String str) {
		
		int count=0,i=0;
		String ans="";
		while(count<=1)
		{
			if(str.charAt(i)==':')
			{
				count++;
				if(count>1)
				{
					break;
				}
			}
			ans=ans+str.charAt(i);
			i++;
		}
		return fi(ans)+" AM";
		
		
	}
	public static String fi(String str)
	{
		char m='\n';
		int k=0;
		while(m!=':')
		{
			m=str.charAt(k);
			k++;
		}
		if(k==2)
		{
			return "0"+str;
		}
		return str;
	}

}
