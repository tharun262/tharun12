package assign;
import java.util.Scanner;
public class reverse {
	public static void main(String[] args) {
		System.out.println("enter the no");
		  Scanner sc = new Scanner(System.in);
	       int num = sc.nextInt();
		   int remainder, reverse = 0;  
		while(num != 0)   
		{  
		remainder = num % 10;  
		reverse = reverse * 10 + remainder;  
		num = num/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
		}  
	}


