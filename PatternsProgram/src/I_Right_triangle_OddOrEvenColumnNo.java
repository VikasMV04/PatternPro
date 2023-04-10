
public class I_Right_triangle_OddOrEvenColumnNo {

	public static void main(String[] args) 
	{
		int n=5;
		System.out.println("Printng column numbers");
		for (int r = 1; r <= n; r++) 
		{
			for (int c = 1; c <= n; c++) 
			{
				if(c%2==0)
				System.out.print("0");
				else
					System.out.print("1");
			}
			System.out.println();
		}

	}

}
