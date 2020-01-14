import java.util.ArrayList;

public class TestLogic
{

	public static void main(String[] args)
	{
		int a[] = new int[]{1,2,3,4,5};
		ArrayList<Integer> array = new ArrayList<Integer>();
        for(int i = 0; i < 5; i++)
        {
        	array.add(a[i]);
        }
        System.out.println(array);
	}

}
