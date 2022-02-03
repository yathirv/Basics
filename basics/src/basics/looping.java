package basics;

public class looping {
	
	public void king()
	{
		int k = 1;

		for (int i = 0; i < 5; i++)
		{
			System.out.print("\n");
			
			for (int j = 1; j < i; j++)
			{
				System.out.print(k*3 + " ");
				k++;
			}
		}
	}
		
		public static void main(String[] args)
		{
			
			looping a = new looping();
			a.king();
		
	}
}