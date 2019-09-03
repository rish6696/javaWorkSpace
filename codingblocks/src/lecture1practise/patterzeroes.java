package lecture1practise;

public class patterzeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,k;
		for(i=1;i<=5;i++)
		{
			if(i==1||i==2)
			{
				for(k=1;k<=i;k++)
				{
					System.out.print(i+"\t");
				}
				System.out.println();
			}
			else
			{
				for(k=1;k<=i;k++)
				{
					System.out.print(i+"\t");
				}
			  System.out.println();
			}
				
		}

	}

}
