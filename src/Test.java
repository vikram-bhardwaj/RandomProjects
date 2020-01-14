import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test
{

	public static void main(String[] args)
	{
		String string1 = "abcde";
		String string2 = "abdfdcde";
		String s3 = "";
		char[] ch1 = string1.toCharArray();
		char[] ch2 = string1.toCharArray();
		List a1 = new ArrayList();
		List a2 = new ArrayList();
		//List<String> myList = new ArrayList<String>(asList(string1));
		int size1 = ch1.length;
		int size2 = ch2.length;
		int size;
		if(size1 > size2)
			size = size1;
		else size = size2;
		
		for(int i = 0; i < size1; i++)
	    {
	        a1 = Arrays.asList(ch1[i]);
	    }
	    for (int i = 0; i < size2; i++) 
	    {
	        a2 = Arrays.asList(ch2[i]);
	    }
	    
	    System.out.println(a1.get(0));
		
	    for(int i = 0; i < size; i++)
	    {
	    	char a = (char) a1.get(i);
	    	
	    	s3 = s3 + Character.toString(a);
	    	System.out.println(a2.get(i));
	    	
	    	a = (char) a2.get(i);
	    	s3 = s3 + Character.toString(a);
	    }
	    int aa1 = size1 - size2;
	    int aa2 = size2 - size1;
	    if(aa1 > 0)
	    {
		    for(int i = 0; i < aa1 ; i++)
		    {
		    	char a = (char) a1.get(i);
		    	s3 = s3 + Character.toString(a);
		    }
	    }
	    if(aa2 > 0)
	    {
		    for(int i = 0; i < aa2 ; i++)
		    {
		    	char a = (char) a2.get(i);
		    	s3 = s3 + Character.toString(a);
		    }
	    }
	    System.out.println(s3);
	}

}
