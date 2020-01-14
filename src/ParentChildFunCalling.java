import java.io.IOException;

class Parent
{
	void fun()
	{
		System.out.println("i'm from parent");
	}
}


class Child extends Parent implements SomethingRandom
{
	void fun()
	{
		System.out.println("i'm from child");
	}
	 public void someFunction() throws Exception
	{
		System.out.println("from random interface");
	}
}

interface SomethingRandom
{
	void someFunction() throws Exception;
	
}

public class ParentChildFunCalling
{
	public static void main(String a[]) throws Exception
	{
		Parent obj = new Child();
		obj.fun();
		
		Child obj2 = new Child();
		obj2.fun();

		Parent obj3 = new Parent();
		obj3.fun();
		
		obj3 = obj2;
		obj3.fun();
		
		obj2.someFunction();

	}
}