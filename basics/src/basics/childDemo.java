package basics;

public class childDemo extends parentDemo{
	
	String name = "Gowthamraj";
	
	public childDemo()
	{
		super();
		System.out.println("Child Class Constructor");
	}
	
	public void getStringData()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void getData()
	{
		super.getData();
		System.out.println("I am child Class");
		
	}

	public static void main(String[] args) {
		
		childDemo cd = new childDemo();
		cd.getStringData();
		cd.getData();
		
		parentDemo c = new parentDemo();
		String names = c.name;
		c.getData();
		System.out.println(names);

	}

}
