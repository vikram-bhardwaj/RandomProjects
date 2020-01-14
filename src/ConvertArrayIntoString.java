
public class ConvertArrayIntoString
{

	public static void main(String[] args)
	{
		String s = "Vikram";
		String s1 = null;
		
		char c[] = {'v', 'i', 'k', 'r', 'a', 'm'};
		
		String temp = new String(c);
		
		System.out.println(temp);
		
		char temp1[] = s.toCharArray();
		
		System.out.println(temp1);
		
		System.out.println(s1.equals(s));
	}

}
