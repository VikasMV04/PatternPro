
public class H_Right_Triangle_ColumnthNo2 {

	public static void main(String[] args) {
		int no=1;
		int n=5;
		for (int r = 1; r <= n; r++) 
		{
			for (int c = 1; c <= r; c++) 
			{
				if(c%2==0)
				System.out.print("0 ");
				else
				System.out.print("1 ");
				no++;
			}
			System.out.println();
		}
		System.out.println();
		for (int r = 1; r <= n; r++) 
		{
			for (int c = 1; c <= r; c++) 
			{
				if(r%2==0)
				System.out.print(r+" ");
				else
				System.out.print("5 ");
				no++;
			}
			System.out.println();
		}
		
		
		
	}

}
