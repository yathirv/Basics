package basics;

public class Constructor {
	
// default constructor not accepting any value
	public Constructor() {

		System.out.println("I am the Constructor");
	}
	
// parameterised constructor

	public Constructor(int a, int b) {
		
	int	c=a+b;

	System.out.println(c);	
	System.out.println("I am the parameterised constructor");
	}

	public void getData() {

		System.out.println("I am the method");
	}
	
	public void getaData() {

		System.out.println("I am IronMan");
	}

	public static void main(String[] args) {

		Constructor c = new Constructor();
		Constructor cd = new Constructor(5 , 9);
		c.getData();
		cd.getaData();

	}

}
