package question_4;

import java.util.Scanner;

public class oddoreven {
	
	  

	public static void main(String args[])
	   {
	      int x;
	      int y;
	      System.out.println("Enter the 1st Number ");
	      Scanner in = new Scanner(System.in);
	      x = in.nextInt();
	      System.out.println("Enter the 2nd Number ");
	      y = in.nextInt();
	      for (int i = x; i <= y; i++)
	      if ( i % 2 == 0 )
	         System.out.println(i +" = " +" Even numer ");
	      else
	         System.out.println(i +" = " +" Odd numer ");
	      in.close();
	   }
	}


