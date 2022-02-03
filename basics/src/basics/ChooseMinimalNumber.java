package basics;

public class ChooseMinimalNumber
{

	public static void main(String[] args)
	{
		int abc[][] = { { 2, 4, 5 }, { 3, -8, 1 }, { 7, 0, 3 } };
		int mini = 1;
		int miniColumn = 0;
		int minirow = 0;
		int maxC = abc[0][miniColumn];    // abc[0] [1]
		int maxR = abc[minirow][0];       // abc[1] [0]

		for (int i = 0; i < 3; i++)
		{
			for (int j = 0; j < 3; j++)
			{

				if (abc[i][j] < mini) // -8 < 0
				{
					mini = abc[i][j]; // abc[1] [1]
					miniColumn = j; // miniColumn = 1
					minirow = i;
				}
			}
		}
		
		int k = 0;
		while (k < 3)
		{
			if (abc[k][miniColumn] > maxC)
				
//				(abc[k] [miniColumn] > abc[0][miniColumn] )
				
			{
				maxC = abc[k][miniColumn];
			}k++;
		}
		
		int l = 0;
		while (l < 3)
		{
			if (abc[minirow][l] > maxR)
				
//				(abc[minirow][l] > abc[minirow][0])
			{
				maxR = abc[minirow][l];
			}l++;
		}


		System.out.println(mini);
		System.out.println(maxC);
		System.out.println(maxR);
	}
}