
public class CheckOutput extends TheParent
{
	protected int i = 3;
	public static void main(String[] args)
	{
		TheParent p = new CheckOutput();
		p.getValue();
		System.out.println(p.i);
		p.print();
	}
	
	public void getValue()
	{
		System.out.println(i*i);
	}
}

class TheParent
{
	protected int i = 4;
	
	public void getValue()
	{
		System.out.println(i*i);
	}
	
	public void print()
	{
		Double obj = new Double("2.4");
		int a = obj.intValue();
		double b = obj.doubleValue();
		float c = obj.floatValue();
		System.out.println(a+b+c);
	}
}

