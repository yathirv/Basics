package basics;

public class ExceptionDemo {

	public static void main(String[] args) {
		
	//	int a = 4;
		int b = 8;
		int c = 0;
		
		try
		{
			int k = b/c;
			System.out.println(k);
		}
		
		catch(ArithmeticException et)
		{
			System.out.println("Arithmetic Exception Error");
		}
		
		catch(Exception e)
		{
			System.out.println("Error");
		}
		
		finally
		{
			System.out.println("Delete cookies");
		}
	}
}
