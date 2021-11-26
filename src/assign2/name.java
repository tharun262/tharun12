package assign2;
import java.util.Scanner;
public class name {
	public static void main(String[] args) {
		int name,address,mobileno;
		System.out.println("enter name");
		Scanner sc= new Scanner(System.in);
		String nam=sc.nextLine();
		
		System.out.println("enter address");
		String addr=sc.nextLine();
		
		System.out.println("enter mobileno");
		long num =sc.nextLong();
		
		System.out.println(nam+addr+num);
	}
}
