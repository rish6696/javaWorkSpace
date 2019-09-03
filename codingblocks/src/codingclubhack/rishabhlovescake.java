package codingclubhack;

import java.util.ArrayList;
import java.util.Scanner;

public class rishabhlovescake {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		String req=s.next();
		int ab=s.nextInt();
		int as=s.nextInt();
		int ac=s.nextInt();
		int pb=s.nextInt();
		int ps=s.nextInt();
		int pc=s.nextInt();
		int money=s.nextInt();
		int rb=counter(req, 'B');
		int rs=counter(req, 'S');
		int rc=counter(req, 'C');
		
		int noc=cakemaker(req,ab,as,ac,rb,rs,rc,pb,ps,pc,money);
		System.out.println(noc);
		
		
		
		

	}
	
	public static int counter(String str,char c) {
		int i=0;
		int counter=0;
		while(i<=str.length()-1)
		{
			if(str.charAt(i)==c)
			{
				counter++;
				
			}
			i++;
			
		}
		return counter;
		
	}
	public static int cakemaker(String req,int ab,int as,int ac,int rb,int rs,int rc,int pb,int ps,int pc,int money) {
		
		int counter=0;
		while(ac<rc&&money>=pc)
		{
			money=money-pc;
			ac++;
		}
		while(ab<rb&&money>=pb)
		{
			money=money-pb;
			ab++;
		}
		while(as<rs&&money>=ps)
		{
			money=money-ps;
			as++;
		}
		
		while(ab>=rb&&as>=rs&&ac>=rc)
		{
			ab=ab-rb;
			as=as-rs;
			ac=ac-rc;
			counter++;
			while(ac<rc&&money>=pc)
			{
				money=money-pc;
				ac++;
			}
			while(ab<rb&&money>=pb)
			{
				money=money-pb;
				ab++;
			}
			while(as<rs&&money>=ps)
			{
				money=money-ps;
				as++;
			}
			
		}
		return counter;
		
	}

}
