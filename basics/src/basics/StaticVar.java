package basics;

public class StaticVar {
	
	String Name;
	static String City = "Chennai"; // class variables - all static variables are cv,it is not part of instance variables
	String Address;  //instance variables
	static int i;
	
	static
	{
		
		i=0;
	}
	
	StaticVar(String name, String address) //local variables
	{
		this.Name = name;
		this.Address = address;
		i++;
		System.out.println(i);
	}
	
	public void getAddress()
	{
		System.out.println(City +" "+Address);
	}
	
	public static void getCity()
	{
		System.out.println(City);
		System.out.println(i);
	}

	public static void main(String[] args) {
		
		StaticVar obj = new StaticVar("john" ,"600028");
		StaticVar obj2 = new StaticVar("johnny" ,"600029");
		StaticVar obj3 = new StaticVar("ram" ,"600011");
		
		obj.getAddress();
		obj2.getAddress();
		obj3.getAddress();
		
		StaticVar.getCity(); // statics methods accessed my class name + satic method
		obj.Address = "kovai";

	}

}
