package basics;

public class thisDemo {
	
	int a = 2; //Global variable
	
	public void getData()
	{
		int a = 3; //Local variable 
		
		int b = a+this.a;
		
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
		
	}

	public static void main(String[] args) {
		
		thisDemo td = new thisDemo();
		System.out.println(td.a);
		td.getData();
		// This refers to current object - the object scope Lies in class level 
		

	}

}
