
public class J_Reverse_Order_Of_Rows {

	public static void main(String[] args) 
	{
		int n=5;
		for (int r = 5; r >=1; r--) 
		{
			
			for (int c = 5; c >=r; c--) 
			{
				System.out.print( c+" ");
			}
			
			System.out.println();
		}

	}

}
