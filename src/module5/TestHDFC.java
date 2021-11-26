package module5;
import java.util.Scanner;
public class TestHDFC {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HDFC hdfc= new HDFC();
		hdfc.setAccNumber(1);
		hdfc.setAccHolderName("tharun");
		hdfc.setAccBalance(4000);
		System.out.println(hdfc);
		System.out.println("===========================");
		System.out.println("changing the name");
		hdfc.setAccHolderName("kumar");
		System.out.println(hdfc);
		System.out.println("===========================");
		
		System.out.println("no" +hdfc.getAccNumber());
		System.out.println("name"+ hdfc.getAccHolderName());
		System.out.println("bal" +hdfc.getAccBalance());
		
		
		 System.out.println("===============================");
	        System.out.println("Calling the withdraw method ");

	        System.out.println("enter the value to withdraw");
	        double amt=sc.nextDouble();
	        hdfc.withdraw(amt);
	        System.out.println(hdfc);
		
	        
	   	 System.out.println("===============================");
	        System.out.println("Calling the deposit method ");

	        System.out.println("enter the value to deposit");
	        double amt2=sc.nextDouble();
	        hdfc.deposit(amt2);
	        System.out.println(hdfc);
		
	}

}
