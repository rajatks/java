package assignment;
import java.util.*;
class NameSorter implements Comparator
{
		public int compare(Object obj1,Object obj2)
		{
			Emp p1=(Emp) obj1;
			Emp p2=(Emp) obj2;
			String n1=p1.name;	
			String n2=p2.name;

			return n1.compareTo(n2);
		}

}
class AgeSorter implements Comparator
{
		public int compare(Object obj1,Object obj2)
		{
			Emp p1=(Emp) obj1;
			Emp p2=(Emp) obj2;
			Integer n1=p1.age;	
			Integer n2=p2.age;
			return n1.compareTo(n2);
		}

}
class SalarySorter implements Comparator
{
		public int compare(Object obj1,Object obj2)
		{
			Emp p1=(Emp) obj1;
			Emp p2=(Emp) obj2;
			Integer n1=p1.salary;	
			Integer n2=p2.salary;
			return n1.compareTo(n2);
		}

}
class DesiginationSorter implements Comparator
{
		public int compare(Object obj1,Object obj2)
		{
			Emp p1=(Emp) obj1;
			Emp p2=(Emp) obj2;
			String n1=p1.degi;	
			String n2=p2.degi;
			return n1.compareTo(n2);
		}

}