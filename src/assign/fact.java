package assign;
import java.util.Scanner;
public class fact {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		 Scanner sc= new Scanner(System.in);
		int i,fact=1;
		int no= sc.nextInt();  
		for(i=1;i<=no;i++)
			fact=fact*i;
			System.out.println("factorial of"+ fact);
	}

}
