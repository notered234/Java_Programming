import java.io.*;
public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		String prime_Array = "";

		try{
			int i;
			for(i=2; i<=200; i++){

			int j;	
			int isPrime=1; //BOOL
			for(j=2; j<= Math.sqrt(i); j++){

				if(i%j == 0){
					isPrime=0;
					break;
				}//NOT A Prime Number
			}// END for
			

			if(isPrime == 1){
				System.out.println( i + " ");
			}		
			}
		}catch(IOException e){}	
		
	}
}

