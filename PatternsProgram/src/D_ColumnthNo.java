
public class D_ColumnthNo {

	public static void main(String[] args) {
		int no=1;
		int n=5;
		for (int r = 1; r <= n; r++) 
		{
			for (int c = 1; c <= n; c++) 
			{
				if(no<10)
				System.out.print(no+"  ");
				else
				System.out.print(no+" ");
				no++;
			}
			System.out.println();
		}
	}

}
