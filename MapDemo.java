import java.util.*;

class MapDemo{
	public static void main(String[] args){

		//Hashtable obj=new Hashtable();
		//HashMap obj=new HashMap();
		//TreeMap obj=new TreeMap();
		LinkedHashMap obj=new LinkedHashMap();
		obj.put("111","Ramesh");
		obj.put("222","Pathan");
		obj.put("333","Raunak");
		obj.put("444","Maahesh");
		obj.put("555","Suresh");
		obj.put("000","Maahesh");
		Set s=obj.entrySet();
		Iterator i=s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}