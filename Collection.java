import java.util.*;
public class Collection {

	public static void main(String args[]){
		
	  ArrayList<String> al=new ArrayList<String>();
	  al.add("bharat");
	  al.add("vamshi");
	  al.add("bharat");
	  al.add("navya");
	  
	  Iterator itr=al.iterator();
	  while(itr.hasNext())
	  {
		  System.out.println(itr.next());
	  }
		
	  LinkedList<String> al1=new LinkedList<String>();
	  al1.add("bharat");
	  al1.add("vamshi");
	  al1.add("bharat");
	  al1.add("navya");
	  
	  for(String str :al1)
	  {
		System.out.println(str);
	  }
		
}
}
