		package lecture6;

		import java.util.Scanner;

		public class asciibteween {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				Scanner s=new Scanner(System.in);
				System.out.println("enter the string");
				StringBuilder sb=new StringBuilder(s.next());
				StringBuilder bb=new StringBuilder();
				int m=sb.length();
				int i,j,x,y,z;
				i=0;
				j=1;
				while(j<=m-1)
				{
					x=sb.charAt(i);
					y=sb.charAt(j);
					z=y-x;
					bb.append(sb.charAt(i));
					bb.append(z);
					
					
					
					
					
					i++;
					j++;
				}
			    bb.append(sb.charAt(m-1));
				System.out.println(bb);
				

			}

		}