import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareObjs
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		List <Employee> myList = new ArrayList<Employee>();
		myList.add(new Employee(9, "Vikrm", "vi@gmail.com"));
		myList.add(new Employee(5, "Vikrm", "vi@gmail.com"));
		myList.add(new Employee(5, "Sikrm", "vi@gmail.com"));
		myList.add(new Employee(1, "Vikrm", "vi@gmail.com"));
		myList.add(new Employee(4, "Vikrm", "vi@gmail.com"));
		CompareObjs obj = new CompareObjs();
				
		obj.sortById(myList);
	}
	
	public void sortById(List<Employee> e)
	{
	    Collections.sort(e);
	    for(Employee e1 : e)
	    {
	    	System.out.println(e1.id + " " + e1.name);
	    }
	}

}

class Employee implements Comparable
{
	int id;
	String name;
	String email;

	public Employee(int id,String name,String email)
	{
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
	 public int compareTo(Object o)
	    {
	        Employee rhs = (Employee)o;

	        if (id > rhs.id)
	            return 1;
	        else if (id < rhs.id)
	            return -1;
	        else
	        	return name.compareTo(rhs.name);
	        	
	    }
	 
}
