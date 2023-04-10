
public class E_Right_Triangle {

	public static void main(String[] args) {
		int n=5;
		System.out.println("Printng column numbers");
		for (int r = 1; r <= n; r++) 
		{
			for (int c = 1; c <= r; c++) 
			{
				System.out.print(" * ");
			}
			System.out.println(" ");
		}


	}

}
