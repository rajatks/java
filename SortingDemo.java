import java.util.*;
public class SortingDemo{
	public static void main(String[] args)
	{
		TreeSet obj=new TreeSet(new NameSorter());
		obj.add(new Person("Ravi",32));
		obj.add(new Person("Rkash",22));
		obj.add(new Person("Raam",42));
		obj.add(new Person("Rohit",82));
		obj.add(new Person("Mohit",33));
		
		Iterator i=obj.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

		System.out.println("--------------------------------");
		
		List list=new LinkedList();
		list.add(new Person("Ravi",32));
		list.add(new Person("akash",22));
		list.add(new Person("Raam",42));
		list.add(new Person("Rohit",82));
		list.add(new Person("mohit",33));

		Collections.sort(list,new NameSorter());
		Iterator it=obj.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
		