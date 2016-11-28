package vamshi;

public class Addprime {
public static void main(String aa[])
{
	int limit=1000,sum=0;
	
		
	System.out.println("prime num btween 1 and " + limit);
	for(int i=1; i < 1000; i++)
    {
           
            boolean isPrime = true;
           
            
            for(int j=2; j < i ; j++)
            {
                   
                    if(i % j == 0)
                    {
                            isPrime = false;
                            break;
                    }
            }
    
            if(isPrime)
            {        sum=sum+i;
           
            }
            
    }        
	System.out.println("sum of first 1000 prime numbers "+sum);
    
	 


}
}
