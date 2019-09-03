package lecture2;

public class patternstarcomplex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,l;
		
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=2*i-2;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=6-i;k++)
			{
				System.out.print("*");
			}
			for(l=1;l<=5-i;l++)
			{
				System.out.print(" ");
			}
			System.out.println();
				
		}

	}

}
