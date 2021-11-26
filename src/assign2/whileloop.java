package assign2;
import java.util.Scanner;
public class whileloop {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,b;
		System.out.println("enter num1");
		a=sc.nextInt();
		
		System.out.println("enter num2");
		b=sc.nextInt();
		 System.out.print("the even numbers between "+a+ " and "+b+" are");
		   int i=a;
		   while (i<=b)
		      {
			   int t=i%2;
		         if(t== 0)
		         System.out.print("\n" +i+" ");
		         i++;
}}}
		        
