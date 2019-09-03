package codinclubcomp;

import java.util.Scanner;

public class elemntreplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int pro=1;
		for(int i=1;i<=n;i++)
		{
			int sc=s.nextInt();
			pro=pro*sc;
		}
		int ans=0;
		int i=1;
		while(ans==0)
		{
			int temp=pow2(i, n);
			if(temp>pro)
			{
				ans=i;
			}
			i++;
			
		}
		System.out.println(ans);
		

	}
	public static int pow2(int a, int b) {
        int re = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                re *= a;        
            }
            b >>= 1;
            a *= a; 
        }
        return re;
    }

}
