package vamshi;
import java.util.*;
public class Rem {
public static void main(String aa[])
{
	ArrayList<String>al=new ArrayList<String>();

	al.add("vamshi");
	al.add("jdnj");
	al.add("fjnd");
	al.add("mshi");
	al.add("oashi");
	ArrayList<String>ab=new ArrayList<String>();
	ab.add("vamshi");
	ab.add("mshi");
	ab.add("isjns");
	ab.add("fjnd");
	ab.retainAll(al);
	
	System.out.println("after retaining the values  we get");
	Iterator itr=ab.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
}
}
}