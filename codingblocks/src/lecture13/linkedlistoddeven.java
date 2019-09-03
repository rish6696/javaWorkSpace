package lecture13;

import java.util.Scanner;

public class linkedlistoddeven  {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter size of list");
		int n=s.nextInt();
		linkedlistmyself list= new linkedlistmyself();
		for (int i = 1; i <=n; i++) {
			list.addlast(s.nextInt());
		}
		
		
		linkedlistmyself ans=oddeven(list);
		ans.display();
		

	}
	
	public static linkedlistmyself oddeven(linkedlistmyself list) throws Exception{
		linkedlistmyself ans=new linkedlistmyself();
		for(int i=0;i<=list.size()-1;i++)
		{
			if((list.getnodeAt(i).data)%2==1)
			{
				ans.addlast(list.getnodeAt(i).data);
			}
		}
		for(int i=0;i<=list.size()-1;i++)
		{
			if((list.getnodeAt(i).data)%2==0)
			{
				ans.addlast(list.getnodeAt(i).data);
			}
		}
		return ans;
		
		
	}

}
