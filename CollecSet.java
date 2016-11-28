import java.util.*;
public class CollecSet {
	
	public static void main(String args[]){
		
		HashSet<String> al=new HashSet<String>();
		  al.add("bharat");
		  al.add("vamshi");
		  al.add("bharat");
		  al.add("navya");
		  
		  Iterator itr=al.iterator();
		  while(itr.hasNext())
		  {
			  System.out.println(itr.next());
		  }
			
		  LinkedHashSet<String> al1=new LinkedHashSet<String>();
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
