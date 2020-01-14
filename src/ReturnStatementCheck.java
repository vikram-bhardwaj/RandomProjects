
public class ReturnStatementCheck
{

	public static void main(String[] args)
	{
		fun();
	}
	
	static int fun()
	{
		try
		{
			System.out.println("hello");
			return 0;
		}
		catch(Exception e)
		{
			System.out.println("bye");
		}
		return 0;
	}

}
