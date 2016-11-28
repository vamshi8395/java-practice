import java.util.Scanner;
public class Add2matrix {

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		 int a[][]=new int[3][3];
		 int b[][]=new int[3][3];
		 int c[][]=new int[3][3];
		 
		 for(int i=0;i<3;i++)
		 {  
			  for(int j=0;j<3;j++)
			  {
				  System.out.println("Enter first matrix" +(i+1) +(j+1));
				  a[i][j]=sc.nextInt();
			  }
		 }
		 
		 for(int i=0;i<3;i++)
		 {  
			  for(int j=0;j<3;j++)
			  {
				  System.out.println("Enter second matrix" +(i+1) +(j+1));
				  b[i][j]=sc.nextInt();
			  }
		 }
		 
		 for(int i=0;i<3;i++)
		 {  
			  for(int j=0;j<3;j++)
			  {
				  c[i][j]=a[i][j]+b[i][j];
			  }
		 }
		 
		 System.out.println("First matrix");
		 for(int i=0;i<3;i++)
		 {  
			  for(int j=0;j<3;j++)
			  {
				  System.out.println(a[i][j]);
			  }
		 }
		 
		 System.out.println("Second matrix");
		 for(int i=0;i<3;i++)
		 {  
			  for(int j=0;j<3;j++)
			  {
				  System.out.println(b[i][j]);
			  }
		 }
		 
		 System.out.println("Resultant matrix");
		 for(int i=0;i<3;i++)
		 {  
			  for(int j=0;j<3;j++)
			  {
				  System.out.println(c[i][j]);
			  }
		 }
		
		
	}
}

