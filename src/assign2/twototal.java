package assign2;
import java.util.Scanner;
public class twototal {
	public static void main(String[] args) {
		int a,b,total;
		System.out.println("enter num1");
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		
		System.out.println("enter num2");
		b=sc.nextInt();
		
		total=a+b;
		System.out.println("total value of two numbers are"+ total);
	}

}
