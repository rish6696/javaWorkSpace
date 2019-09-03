package lecture9;

public class nqueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans;
		boolean board[][]= new boolean [4][4];
	   ans=countqueens(board,0);
	   System.out.println(ans);
		
		
		

	}
	public static int countqueens(boolean[][] board,int row)
	{
		if(row==board.length)
		{
			return 1;
		}
		int ways=0;
		for(int col=0;col<board[row].length;col++)
		{
			if(issafe(board,row,col))
			{
				board[row][col]=true;
				ways=ways+countqueens(board,row+1);
				board[row][col]=false;
			}
		}
		return ways;
	}
	public static boolean issafe(boolean[][],int row,int col)
	{
		
	}

}
