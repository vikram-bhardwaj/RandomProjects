import java.util.Scanner;

public class RemoveDuplicate
{
	Integer i;
	Integer n;
	Integer j;
	Integer k;
	
	Integer input[];
	Integer anotherArray[] = null;
	Scanner sc = new Scanner(System.in);
	
	public void init()
	{
		System.out.print("Please enter the size of the array: ");
		
		n = sc.nextInt();
		input = new Integer[n];
		
		for (i = 0; i < n; i++)
		{
			input[i] = sc.nextInt();
		}
		
		System.out.print("Your inputs are: ");
		for (j = 0; j < n; j++)
		{
			if(j< n-1)
				System.out.print(input[j] + ", ");
			else 
				System.out.print(input[j]);
		}
		
		anotherArray = new Integer[n];
		for(k = 0; k < n; k++)
		{
			if(!duplicate(input[k]))
				anotherArray[k] = input[k];
		}
		System.out.print("\nNumbers after removing duplicates: ");
		for (i = 0; i < n; i++)
		{
			if(anotherArray[i] != null)
				System.out.print(anotherArray[i] + "  ");
		}
	}
	
	Boolean duplicate(Integer value)
	{
		Boolean b = false;
		for (Integer l = 0; l < n; l++)
		{
			if(value == anotherArray[l])
			{
				b = true;
			}
		}
		return b;
	}
}
