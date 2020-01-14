import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test2
{

	public static void main(String[] args)
	{
		String a = "ssgggdggg333wee1";
		System.out.println(process_string(a));

	}
	
	public static String process_string(String in_str)
    {
    // Write your code here
    String str[] = in_str.split(in_str);
    List<String> al = new ArrayList<String>();
    al = Arrays.asList(str);
    int size = al.size();
    int z = 10;
	while(true)
	{
		for(int i = 0; i < size; i++)
	    {
	    	if(al.get(i).equals(al.get(i+1)))
	    	{
	    		if(al.get(i+1).equals(al.get(i+2)))
	        	{
	    			if(al.get(i+2).equals(al.get(i+3)))
	    	    	{
	    	    		al.remove(i);
	    	    		al.remove(i+1);
	    	    		al.remove(i+2);
	    	    	}
	        	}
	    	}
	    }
		z--;
		if(z<1)
			break;
    }
	
	String listString = "";

	for (String s : al)
	{
	    listString += s + "\t";
	}
	return listString;
   }
}
