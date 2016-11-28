public class Example {



	public static void main(String args[]){
		
		String str="am not in danger am the danger";
		char ch=str.charAt(5);
		System.out.println(ch);
		
		
		char[] mystr=new char[8];
		str.getChars(3,11,mystr,0);
		System.out.println(mystr);
		
			
		
	}
	
}
