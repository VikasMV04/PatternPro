

public class K_Characters_Right_Angle_Triangle {

	public static void main(String[] args) 
	{
		char ch='A';
		int n=5;
		for (int r = 1; r <=n; r++) 
		{
			for (int c = 1; c <=r; c++) 
			{
				System.out.print(ch+" ");
			}
			ch++;
			System.out.println();
		}
		
		System.out.println();
		
		for (int r = 1; r <=n; r++) 
		{
			char ch1='A';
			for (int c = 1; c <=r; c++) 
			{
				System.out.print(ch1++ +" ");
			}
			ch++;
			System.out.println();
		}
		
		System.out.println();
		
		char ch1='A';
		for (int r = 1; r <=n; r++) 
		{
			for (int c = 1; c <=r; c++) 
			{
				System.out.print(ch1++ +" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int r = 1; r <=n; r++) 
		{
			char ch2='Z';
			for (int c = 1; c <=r; c++) 
			{
				System.out.print(ch2-- +" ");
			}
			System.out.println();
		}
		

		System.out.println();
		char ch2='Z';
		for (int r = 1; r <=n; r++) 
		{
			for (int c = 1; c <=r; c++) 
			{
				System.out.print(ch2 +" ");
			}
			ch2--;
			System.out.println();
		}


	}

}
