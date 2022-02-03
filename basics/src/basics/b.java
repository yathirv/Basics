package basics;

public class b extends a
{
	int i =20;
	
	public void height()
	{
		System.out.println("Heigth of b");
	}

public static void main(String args[])
{
	a age = new b();
	int h = age.i;
	System.out.println(h);
}
}