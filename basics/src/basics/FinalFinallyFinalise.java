package basics;

public class FinalFinallyFinalise {

	public static void A()
	{
		try
		{
			System.out.println("inside A");
			throw new RuntimeException("demo");
		}
		finally
		{
			System.out.println("A's finally");
		}
	}

	public static void B()
	{
		try
		{
			System.out.println("inside B");
			return;
		}
		finally
		{
			System.out.println("B's finally");
		}

	}
	
	

	public static void main(String[] args)
	{
		FinalFinallyFinalise obj = new FinalFinallyFinalise();        
        // printing the hashcode   
        System.out.println("Hashcode is: " + obj.hashCode());           
        obj = null;   
        
        int a = 8; // Non final variable
        final int b = 6; // final variable

        // modifying the non final variable : Allowed
        a++;
        System.out.println(a);

        // modifying the final variable :
        // Immediately gives Compile Time error.
        // b++;

        System.out.println(b);

        try
        {
        	A();
        }
        catch (Exception e)
        {
        	System.out.println("Exception caught");
        }
        B();

        @SuppressWarnings("unused")
        String s = new String("RR");
        s = null;

        // Requesting JVM to call Garbage Collector method
        // calling the garbage collector using gc()   
        System.gc();
        System.out.println("End of the garbage collection");

	}

	// Here overriding finalize method
	public void finalize()
	{
		System.out.println("finalize method overriden");
	}

}
