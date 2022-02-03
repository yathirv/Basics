package basics;

class student   // sub class
{
	int rollNumber ; //Instance variables 
	String Name;
	static String College = "TCS"; //Static variables 
	
	student ( int k , String s) // constructor
	{
		rollNumber = k;
		Name = s;
	}
	
	void display() // method 
	{
		System.out.println(rollNumber + " " + Name + " " + College);
	}
	
	static void change()
	{
		College = "MIT";
		System.out.println(College);
	}
}

public class StaticVariable {

	public static void main(String[] args) // main class
	
	{
		student s1 = new student(111, "Kavin");
		student s2 = new student(333, "Karthik");
		
		student.change();
		
		// stack Memory created for s1 and s2
		// heap Memory created for Name=Kavin; , Name = karthik ;
		// Static variable can be accessed by both object without creating separate memory 
		
		s1.display();
		s2.display();
		
	}

}
