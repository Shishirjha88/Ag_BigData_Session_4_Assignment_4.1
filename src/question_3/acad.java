package question_3;

import java.util.Scanner;

public class acad {

	int c;
	
	void addition(int x,int y)
	{
	 c=x+y;
	}
public static void main(String[] arg)
{
int a,b;
Scanner sc = new Scanner(System.in);
System.out.println("First number is:");
a=sc.nextInt();
System.out.println("Second number is:");
b=sc.nextInt();
acad r=new acad();
r.addition(a,b);
System.out.println("Sum is : "+r.c);

sc.close();

}

}