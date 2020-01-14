import java.util.*;

public class ArraySort
{
	public static void main(String a[])
	{
		Integer arr[] = {4,6,2,8,5,4,6,7,1,1,2,4,6,5,8};
		
		System.out.println("Unsorted array: " );
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		sort(arr);
		Arrays.sort(arr);
		
		System.out.println("\nSorted array: " );
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		
	}
	
	public static void sort(Integer[] arr)
	{
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));

		System.out.println("\nUnsorted List: " );
		for(int i=0;i<list.size(); i++)
		{
			System.out.print(list.get(i) + " ");
		}
		
		Collections.sort(list);
		
		System.out.println("\n" + list.contains(5));
		
		System.out.println("\nsorted List: " );
		for(int i=0;i<list.size(); i++)
		{
			System.out.print(list.get(i) + " ");
		}
		System.out.println("\n...");
		for(Integer a : list)
		{
			System.out.print(list.get(a) + " ");
		}
		System.out.println("\n~~~With Iterator~~~");
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext())
		{
			System.out.print(iter.next() + " ");
		}
		System.out.println("\n");
		list.forEach((n) -> System.out.print(n + " "));
	}
}
