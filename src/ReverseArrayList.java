import java.util.ArrayList;

public class ReverseArrayList
{

	public static void main(String[] args)
	{
		ArrayList array = new ArrayList();
		array.add(112);
		array.add(113);
		array.add(111);
		array.add(234);
		array.add(222);
		
		System.out.println(array.get(0));
		
		int b = (int) array.get(4);
		
		array.add(0, b);

		System.out.println(array);
		
		
	}

}
