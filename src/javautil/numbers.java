package javautil;
import java.util.Scanner;
public class numbers {
	public static void main(String[] args) {
	    
		// To find biggest of two numbers
		
		Scanner kb = new   Scanner(System.in);
//		System.out.println("Enter firt number");
//		int a= kb.nextInt();
//		System.out.println("enter second number");
//		int b = kb.nextInt();
//		
//		if(a>b)
//		{
//		System.out.println("Bigest number is ="+a);	
//		}
//		else
//			System.out.println("biggest number is="+b);
//		
		
		//  find biggest number in three numbers
		
		System.out.println("Enter firt number");
		int x= kb.nextInt();
		System.out.println("enter second number");
		int y = kb.nextInt();
		System.out.println("enter third number");
		int z = kb.nextInt();
		if((x>y)&&(x>z))
		{
			System.out.println("Biggest number is= "+x);
		}
		else if((y>x)&&(y>z))
		{
			System.out.println("Biggest number is= "+y);
		}
		else
		{
			System.out.println("Biggest number is ="+z);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
}
}