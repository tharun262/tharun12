package assign2;
import java.util.Scanner;
public class power {
	public static void main(String[] args) {
		System.out.println("enter num1");
		Scanner sc= new Scanner(System.in);
		int base=sc.nextInt();
		
		System.out.println("enter num2");
		int expo=sc.nextInt();
			    long result = 1;
			    while (expo!= 0) {
			      result *= base;
			      --expo;
			    }

			    System.out.println("Answer = " + result);
			  }
			}

	