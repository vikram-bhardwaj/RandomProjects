
public class ExceptionWithExit
{

	public static void main(String[] args)
	{
		System.out.println("Before exception");
		
		try
		{
			System.out.println("trying something");
			ExceptionWithExit obj = new ExceptionWithExit();
			obj.myFun();
			System.exit(0);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println("Hello from finally");
		}
		
	}
	
	public int myFun()
	{
		try
		{
			System.out.println("hi");
			return 1;
		}
		catch(Exception e)
		{
			System.out.println("bye");
		}
		finally
		{
			System.out.println("hello");
			
		}
		return 0;
		
	}
}
