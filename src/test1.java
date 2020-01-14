import java.util.ArrayList;
import java.util.List;

public class test1
{

	public static void main(String[] args)
	{
		List<Integer> jars= new ArrayList<>();
		jars.add(3);
		jars.add(4);
		jars.add(7);
		jars.add(13);
		jars.add(7);
		jars.add(9);
		jars.add(2);
		System.out.println(maximum_cookies(jars));


	}

    public static int maximum_cookies(List<Integer> jars) {
    // Write your code here
    int size = jars.size();
    int sum1 = 0;
    int sum2 = 0;
    for(int i = 0; i < size; i++)
    {
        if( i % 2 == 1)
        {
        	int a = jars.get(i);
            sum1 = sum1 + a;
        }
        else if( i % 2 == 0)
        {
        	int b = jars.get(i);
            sum2 = sum2 + b;
        }
    }
    if(sum1 > sum2)
    {
        return sum1;
    }
    if(sum1 < sum2)
    {
        return sum2;
    }

    return sum1;
    }
}
