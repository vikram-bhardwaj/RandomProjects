import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIterator
{

	public static void main(String[] args)
	{
		Map<String, Integer> myMap = new HashMap<>();
		
		myMap.put("one", 1); 
		myMap.put("two", 2);
		myMap.put("three", 3);
		myMap.put("four", 4);
		myMap.put("five", 5);
		myMap.put("six", 6);
		
		for(Map.Entry<String, Integer> map : myMap.entrySet())
		{
			System.out.println("Key: " + map.getKey() + "         Value: " + map.getValue());
		}
		System.out.println(myMap);
		System.out.println(myMap.entrySet());
		
		
	}

}
