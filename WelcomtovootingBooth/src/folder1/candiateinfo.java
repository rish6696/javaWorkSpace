package folder1;

public class candiateinfo implements Comparable<candiateinfo> {
	
	String name,party,fathername,Dob;
	String adharno,ballotno;
	int numberofvotes=0;
	public candiateinfo(String name,String party,String fathername,String Dob,String adharno,String ballotno)
	{
		this.name=name;
		this.party=party;
		this.fathername=fathername;
		this.Dob=Dob;
		this.adharno=adharno;
		this.ballotno=ballotno;
		
	}
	
	public String toString()
	{
	    System.out.println("NAME:"+this.name);
	    System.out.println("PARTY:"+this.party);
	    System.out.println("FATHER'S NAME:"+this.fathername);
	    System.out.println("DOB:"+this.Dob);
	    System.out.println("ADHAR NO:"+this.adharno);
	    System.out.println("BALLOT NO:"+this.ballotno);
	    return "";
	    
	}

	@Override
	public int compareTo(candiateinfo o) {
		// TODO Auto-generated method stub
		return this.numberofvotes-o.numberofvotes;
	}
	

}
