
public class EHCheck
{

	public static void main(String[] args)
	{
		try
		{
			System.out.println("hello");
		}
		//System.out.print("We can't write something here!!");
		catch(Exception e)
		{
			System.out.println("error");
		}
		new EHCheck().p();
	}

	public void p()
	{
		System.out.println("P P P P P P P P");
		
	}
}
