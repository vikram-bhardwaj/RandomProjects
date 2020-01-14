import java.util.Scanner;

public class LargestSubArraySum
{
	Integer i,j,n;
	Integer sum, sum1 = 0, sum2 = 0;
	Integer startIndex, endIndex;
	Integer input[];
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
		
		for ( i = 0; i < n-1; i++ )
		{
			sum1 = input[i];
			for ( j = i+1; j < n; j++)
			{
				sum1 = sum1 + input[j];
				if(sum1 > sum2)
				{
					sum2 = sum1;
					startIndex = i;
					endIndex = j;
				}
			}
		}
		
		System.out.print("Sum is : " + sum2);
		System.out.print("\nindexes are " + startIndex + "-" + endIndex);	
	}
}