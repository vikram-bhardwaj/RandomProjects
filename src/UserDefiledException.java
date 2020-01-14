
public class UserDefiledException 
{
	public static void main(String s[])
	{
		System.out.print("start");
		
		try
		{
			int a = 0, b = 0;
			String str = ""+(a/b);
			throw new MyException(str);
		}
		catch(MyException e)
		{
			System.out.println("catch");
		}
	}
}


class MyException extends Exception
{
	public MyException(String s)
	{
		super(s);
	}

	
}