package question_5;

import java.util.Scanner;

public class abcd {

	public static void main(String[] args) {
	
		      int i;
		      int n = 1;

		      Scanner input = new Scanner(System.in);
		     

		         System.out.print("Enter a number: ");
		         i = input.nextInt();
		         System.out.print(10 + " multiples of " + i + " are: ");
		         for(n=1 ;n <= 10; n++) {
		        	 System.out.println("\t");
		        	 
		        	 System.out.print( n +"*" +i +" = " +n*i);
		        	 
		         }
		        	 
		        	 
		         
		         input.close();
		   
		}
	
}

