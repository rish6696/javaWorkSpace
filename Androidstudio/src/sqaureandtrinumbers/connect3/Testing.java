package sqaureandtrinumbers.connect3;

public class Testing {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int k=1;
		     boolean[]twochances=new boolean[9];
		   char[][]gamestate=new char[3][3];
		   for(int i=0;i<=8;i++)
		   {
			   Entry(i, gamestate,k);
			   k++;
		   }
		   System.out.println(samecol(gamestate));
		   System.out.println(samerow(gamestate));
		   System.out.println(samedia(gamestate));
		   

		
		
		

	}
	public static boolean samerow(char[][]gamestate)
    {
        char prev=gamestate[0][0];
        for (int i=0;i<=2;i++)
        {
            for (int j=0;j<=2;j++)
            {
                char curr=gamestate[i][j];
                {
                        if(prev!=curr)
                        {
                            return false;
                        }
                        prev=curr;
                }
            }
            return true;
        }
        return true;
    }
    public static boolean samecol(char[][]gamestate)
    {
        char prev=gamestate[0][0];
        for (int i=0;i<=2;i++)
        {
            for (int j=0;j<=2;j++)
            {
                char curr=gamestate[j][i];
                {
                    if(prev!=curr)
                    {
                        return false;
                    }
                    prev=curr;
                }
            }
            return true;
        }
        return false;

    }
    public static boolean samedia(char[][]gamestate)
    {
        int i=0;
        int j=0;
        char prev=gamestate[i][j];
        boolean ans;
        while(i<=2)
        {
            char curr=gamestate[i][j];
            if(curr!=prev)
            {
                return false;
            }
            prev=curr;
            i++;
            j++;
        }
        return true;
    }
    public static  void Entry(int pos,char[][]gamestate,int k)
    {
        int row;
        int col;
        if(pos>=0&&pos<=2)
        {
            row=0;
            col=pos;
        }
        else if(pos>=3&&pos<=5)
        {
            row=1;
            col=pos-3;
        }
        else
        {
            row=2;
            col=pos-6;
        }
        if(k%2==1)
        {
            gamestate[row][col]='Y';
        }
        else
        {
            gamestate[row][col]='R';
        }

    }

}
