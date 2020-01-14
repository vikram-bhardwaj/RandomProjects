public class MainWithStaticCalls 
{
	static String[] str = {"a", "b"};

    {
        System.out.println("Init block called");
    }

    static
    {
        System.out.println("Static called");
        for(int i = 0; i < 2; i++)
        {
        	str[i] = str[i]+str[i];
        }
        main(str);
    }

    public MainWithStaticCalls() 
    {
        System.out.println("this is constructor");
    }

    void MainWithStaticCalls() 
    {
        System.out.println("this is NOT constructor");
    }

    public static void nope() 
    {
        System.out.println("Nope");
    }

    public static void main(String[] a) 
    {
        MainWithStaticCalls.nope();
        System.out.println("************");
        MainWithStaticCalls obj = new MainWithStaticCalls();
        NewClass nc = new NewClass();
        nc.callMe();
        System.out.println("Main");
        for(int i = 0; i < 2; i++)
        {
        	System.out.println(str[i]);
        }
    }

}

class NewClass
{
    public void callMe()
    {
        System.out.println("I'm called");
    }
}