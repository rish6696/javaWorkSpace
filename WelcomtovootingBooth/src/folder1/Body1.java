package folder1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import Heap.Heap;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Body1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ArrayList<candiateinfo>>mainlist=new ArrayList<>();
		ArrayList<String> nameofposts=new ArrayList<>();
		ArrayList<String> voterslist=new ArrayList<>();
		ArrayList<ArrayList<candiateinfo>>anslist=new ArrayList<>();
		
		foradminpart1(mainlist,nameofposts);
		System.out.println("*********************************************ADMIN WORK ENDS HERE********************************************");
		System.out.println("*************************************************************************************************************");
		electionstartsorpart2(mainlist, nameofposts);
		System.out.println("************************************************************************************************************");
		System.out.println("********************************************VOTERS CAN START GIVING THEIR VOTES*****************************");
		votersstart();
		part3(mainlist, nameofposts, voterslist);
		part4(mainlist,nameofposts);
		
		
	    
	    

	}
	public static  void foradminpart1(ArrayList<ArrayList<candiateinfo>>mainlist,ArrayList<String> nameofposts)
	{
		
		Scanner s=new Scanner(System.in);
	    System.out.println("**************************************************************************************************************");
	    System.out.println("*********************************************WELCOME TO VOOTING BOOTH*****************************************");
	    System.out.println("                                             ~~~~~~~~~~~~~~~~~~~~~~~~                                         ");
	    welcome();
	    System.out.println();
	    System.out.println();
	    System.out.println();
	    System.out.println("ENTER THE NUMBER OF POSTS FOR WHICH YOU WANT TO CONDUCT ELECTIONS");
	    numofposts();
	    int numofpost=s.nextInt();
	    System.out.println("Enter the name of posts for which you want to conduct election");
	    enternameofpostaudio();
	    //ArrayList<String> nameofposts=new ArrayList<>();
	    for(int i=1;i<=numofpost;i++)
	    {
	        String name=s.next();
	        nameofposts.add(name);
	    }
	    ArrayList<Integer> numberofcandi=new ArrayList<>();
	    for(int i=1;i<=numofpost;i++)
	    {
	    	ArrayList<candiateinfo> seclist=new ArrayList<>();
	    	System.out.println("ENTER NUMBER OF CANDIDATES FOR "+nameofposts.get(i-1));
	    	numofcandi();
	    	int noc=s.nextInt();
	    	numberofcandi.add(noc);
	    	
	    	for(int j=1;j<=noc;j++)
	    	{
	    		System.out.println("ENTER DEATILS FOR "+j+"th/st/nd CANDIDATE FOR "+nameofposts.get(i-1));
	    	    System.out.println("-->NAME OF CANDIDATE");
	    	    nameofcandi();
	    	    String name=s.next();
	    	    System.out.println("-->FATHER's NAME OF CANDIDATE");
	    	    fathersname();
	    	    String fname=s.next();
	    	    System.out.println("-->PARTY FROM WHICH CANDIDATE BELONG");
	    	    partyfrom();
	    	    String partyname=s.next();
	    	    System.out.println("-->DOB OF CANDIDATE");
	    	    dob();
	    	    String dob=s.next();
	    	    System.out.println("-->AADHAR NUMBER OF CANDIDATE");
	    	    adharcandi();
	    	    String adhar=s.next();
	    	    System.out.println("-->BALLOT NUMBER OF CANDIDATE");
	    	    ballotnumber();
	    	    String ballotno=s.next();
	    	    candiateinfo candi=new candiateinfo(name, partyname, fname, dob, adhar, ballotno);
	    	    seclist.add(candi);
	    	    }
	    	mainlist.add(seclist);
	        
	    	
	    	
	    }
	    
	    

	}
	public static void electionstartsorpart2(ArrayList<ArrayList<candiateinfo>>mainlist,ArrayList<String> nameofposts)
	{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~BELOW ARE THE LIST OF CANDIDATES FOR VARIOUS POSTS~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		belowisthelist();
		for(int i=0;i<=mainlist.size()-1;i++)
		{
			ArrayList<candiateinfo> seclist=mainlist.get(i);
			String name=nameofposts.get(i);
			System.out.println("                                         "+name+":");
			for(int j=0;j<=seclist.size()-1;j++)
			{
				System.out.println(seclist.get(j));
			}
			
		}
	
	}
	public static void part3(ArrayList<ArrayList<candiateinfo>>mainlist,ArrayList<String> nameofposts,ArrayList<String>voterslist)
	{
		
		Scanner s=new Scanner(System.in);
		boolean areyoulast=false;
		while(!areyoulast)
		{
			System.out.println("ENTER YOUR AADHAR NUMBER");
			enteryouradhar();
			String adhar=s.next();
			if(voterslist.contains(adhar))
			{
				beeep();
				duplicacy();
				
				
			}
			else
			{
				voterslist.add(adhar);
				for(int i=0;i<=mainlist.size()-1;i++)
				{
					ArrayList<candiateinfo> seclist=mainlist.get(i);
					String name=nameofposts.get(i);
					System.out.println("ENTER YOUR CANDIDATE FOR THE POST OF "+name);
					giveyourvote();
					String vote=s.next();
					for(int j=0;j<=seclist.size()-1;j++)
					{
						if(vote.equals(seclist.get(j).name))
						{
							seclist.get(j).numberofvotes++;
						}
					}
					
				}
				System.out.println("ARE YOU A LAST CANDIDATE TO VOTE");
				areyoulast();
				System.out.println("YOUR ANSWER SHOULD BE EITHER TRUE OR FALSE");
				trueorfalse();
				areyoulast=s.nextBoolean();
				
			}
		}
	}
	public static void part4(ArrayList<ArrayList<candiateinfo>>mainlist,ArrayList<String> nameofposts)
	{
		for(int i=0;i<=mainlist.size()-1;i++)
		{
			ArrayList<candiateinfo> tielist=new ArrayList<>();
			ArrayList<candiateinfo> seclist=mainlist.get(i);
			String name=nameofposts.get(i);
			Heap<candiateinfo> heap=new Heap<candiateinfo>(seclist, false);
			int winnervotes=heap.gethpriority().numberofvotes;
			tielist.add(heap.gethpriority());
			for(int m=1;m<=seclist.size()-1;m++)
			{
				if((seclist.get(i)).numberofvotes==winnervotes)
				{
					tielist.add(seclist.get(i));
				}
			}
			if(tielist.size()==1)
			{
				System.out.println("WINNER FOR THE POST OF "+name+":");
				winners();
				System.out.println(heap.gethpriority());
				
			}
			else
			{
				System.out.println("WINNER CANNOT BE DECIDED,SINCE THERE IS A TIE BETWEEN FOLLOWING CANDIDATES");
				tie();
				for(int k=0;k<=tielist.size()-1;k++)
				{
					System.out.println(tielist.get(k));
					
				}
			}
			


			
			
			
		}
	}
	public static void beeep()
	{
		try
		{
			FileInputStream fileinputstream=new FileInputStream("Mfg.mp3");
			Player player=new Player(fileinputstream);
			player.play();
			System.out.println("****************DUPLICACY IN AADHAR NUMBER****************");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		catch(JavaLayerException e)
		{
			e.printStackTrace();
		}
		
	}
	public static void enternameofpostaudio()
	{
		try
		{
			FileInputStream fileinputstream=new FileInputStream("enterthenameofposts.mpeg");
			Player player=new Player(fileinputstream);
			player.play();
			//System.out.println("*");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		catch(JavaLayerException e)
		{
			e.printStackTrace();
		}
	}
	public static void fathersname()
	{
		try
		{
			FileInputStream fileinputstream=new FileInputStream("fathersname.mpeg");
			Player player=new Player(fileinputstream);
			player.play();
			//System.out.println("*");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		catch(JavaLayerException e)
		{
			e.printStackTrace();
		}
	}
	public static void dob()
	{
		try
		{
			FileInputStream fileinputstream=new FileInputStream("dob.mpeg");
			Player player=new Player(fileinputstream);
			player.play();
			//System.out.println("*");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		catch(JavaLayerException e)
		{
			e.printStackTrace();
		}
	}
	public static void areyoulast()
	{
		try
		{
			FileInputStream fileinputstream=new FileInputStream("areyoulast.mpeg");
			Player player=new Player(fileinputstream);
			player.play();
			//System.out.println("*");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		catch(JavaLayerException e)
		{
			e.printStackTrace();
		}
	}
	public static void ballotnumber()
	{
		try
		{
			FileInputStream fileinputstream=new FileInputStream("ballotnumber.mpeg");
			Player player=new Player(fileinputstream);
			player.play();
			//System.out.println("*");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		catch(JavaLayerException e)
		{
			e.printStackTrace();
		}
	}
	public static void belowisthelist()
	{
		try
		{
			FileInputStream fileinputstream=new FileInputStream("belowisthelist.mpeg");
			Player player=new Player(fileinputstream);
			player.play();
			//System.out.println("*");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		catch(JavaLayerException e)
		{
			e.printStackTrace();
		}
	}
	public static void enteryouradhar()
	{
		try
		{
			FileInputStream fileinputstream=new FileInputStream("enteryouradharnumber.mpeg");
			Player player=new Player(fileinputstream);
			player.play();
			//System.out.println("*");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		catch(JavaLayerException e)
		{
			e.printStackTrace();
		}
	}
	public static void partyfrom()
	{
		try
		{
			FileInputStream fileinputstream=new FileInputStream("partyfromwhich.mpeg");
			Player player=new Player(fileinputstream);
			player.play();
			//System.out.println("*");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		catch(JavaLayerException e)
		{
			e.printStackTrace();
		}
	}
	public static void votersstart()
	{
		try
		{
			FileInputStream fileinputstream=new FileInputStream("votersstart.mpeg");
			Player player=new Player(fileinputstream);
			player.play();
			//System.out.println("*");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		catch(JavaLayerException e)
		{
			e.printStackTrace();
		}
	}
	public static void adharcandi()
	{
		try
		{
			FileInputStream fileinputstream=new FileInputStream("aadharcandi.mpeg");
			Player player=new Player(fileinputstream);
			player.play();
			//System.out.println("*");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		catch(JavaLayerException e)
		{
			e.printStackTrace();
		}
	}
	public static void nameofcandi()
	{
		try
		{
			FileInputStream fileinputstream=new FileInputStream("nameofcandi.mpeg");
			Player player=new Player(fileinputstream);
			player.play();
			//System.out.println("*");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		catch(JavaLayerException e)
		{
			e.printStackTrace();
		}
	}
	public static void welcome()
	{
		try
		{
			FileInputStream fileinputstream=new FileInputStream("welcome.mpeg");
			Player player=new Player(fileinputstream);
			player.play();
			//System.out.println("*");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		catch(JavaLayerException e)
		{
			e.printStackTrace();
		}
	}
	public static void numofposts()
	{
		try
		{
			FileInputStream fileinputstream=new FileInputStream("numofpost.mpeg");
			Player player=new Player(fileinputstream);
			player.play();
			//System.out.println("*");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		catch(JavaLayerException e)
		{
			e.printStackTrace();
		}
	}
	public static void trueorfalse()
	{
		try
		{
			FileInputStream fileinputstream=new FileInputStream("trueorfalse.mpeg");
			Player player=new Player(fileinputstream);
			player.play();
			//System.out.println("*");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		catch(JavaLayerException e)
		{
			e.printStackTrace();
		}
	}
	public static void duplicacy()
	{
		try
		{
			FileInputStream fileinputstream=new FileInputStream("duplicacy.mpeg");
			Player player=new Player(fileinputstream);
			player.play();
			//System.out.println("*");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		catch(JavaLayerException e)
		{
			e.printStackTrace();
		}
	}
	public static void winners()
	{
		try
		{
			FileInputStream fileinputstream=new FileInputStream("winners.mpeg");
			Player player=new Player(fileinputstream);
			player.play();
			//System.out.println("*");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		catch(JavaLayerException e)
		{
			e.printStackTrace();
		}
	}
	public static void numofcandi()
	{
		try
		{
			FileInputStream fileinputstream=new FileInputStream("numofcandi.mpeg");
			Player player=new Player(fileinputstream);
			player.play();
			//System.out.println("*");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		catch(JavaLayerException e)
		{
			e.printStackTrace();
		}
	}
	public static void tie()
	{
		try
		{
			FileInputStream fileinputstream=new FileInputStream("tie.mpeg");
			Player player=new Player(fileinputstream);
			player.play();
			//System.out.println("*");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		catch(JavaLayerException e)
		{
			e.printStackTrace();
		}
	}
	public static void giveyourvote()
	{
		try
		{
			FileInputStream fileinputstream=new FileInputStream("giveyourvote.mpeg");
			Player player=new Player(fileinputstream);
			player.play();
			//System.out.println("*");
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			
		}
		catch(JavaLayerException e)
		{
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
	
}


