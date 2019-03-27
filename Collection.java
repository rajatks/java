import java.util.*;
class Collection{
	public static void main(String[]args){
		//HashSet obj=new HashSet();
		TreeSet obj=new TreeSet();
		//LinkedHashSet obj=new LinkedHashSet();
		//Vector obj=new Vector();
		//ArrayList obj=new ArrayList();
		//LinkedList obj=new LinkedList();
		obj.add("111");
		obj.add("222");
		obj.add("444");
		obj.add("333");
		obj.add("111");
		//obj.addFirst("000");
		//obj.addLast("999");
		//obj.add(3,"middle");
		Iterator i=obj.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}