package assign2;
import java.util.Scanner;
public class while2 {
	public static void main(String[] args) {
		int t,i;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the first number for the range: ");
		int num1=scan.nextInt();
		System.out.print("Enter the second number for the range: ");
		int num2=scan.nextInt();
		System.out.print("\nDisplay the even numbers between "+num1+" and "+num2+" are :");
		i=num1;
		while(i<=num2)
		{ 
		t=i%2; 
		if(t==0) 
		System.out.println(i);
		i++;
		}
	}
}
