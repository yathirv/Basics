package basics;

public class multiDimensionArray {

	public static void main(String[] args) {
// TODO Auto-generated method stub
////a[row][coloum]
		
		int a[][] = new int[3][3];
		a[0][0] = 2;
		a[0][1] = 4;
		a[0][2] = 5;
		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 7;
		a[2][0] = 5;
		a[2][1] = 9;
		a[2][2] = 2;
//System.out.println(a[1][0]);
		/*
		 * int b[][]= {‌{2,4,5},{3,4,7},{5,2,1}}; System.out.println(b[2][1]);
		 */

		for (int i = 0; i < 3; i++) // row
		{
			for (int j = 0; j < 3; j++) // coloumn
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("\n");
		}
	}
}