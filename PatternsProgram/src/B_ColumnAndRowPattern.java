
public class B_ColumnAndRowPattern {

	public static void main(String[] args) 
	{
		int n=5;
		System.out.println("Printng column numbers");
		for (int r = 1; r <= n; r++) 
		{
			for (int c = 1; c <= n; c++) 
			{
				System.out.print(c);
			}
			System.out.println();
		}
		
		System.out.println("Printng row numbers");
		for (int r = 1; r <= n; r++) 
		{
			for (int c = 1; c <= n; c++) 
			{
				System.out.print(r);
			}
			System.out.println();
		}

	}

}
