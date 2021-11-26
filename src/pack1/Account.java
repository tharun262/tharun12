package pack1;
import java.util.Scanner;
public class Account {
    private int accNo;
    private String accHolderName;
    private double balance;
 
    Scanner sc= new Scanner(System.in);
    		
    public void accept()
    {
    	System.out.println("accno, accholdr name, bal");
    accNo=sc.nextInt();
    accHolderName=sc.next();
    balance=sc.nextDouble();
    }
    
    public void display()
    {
    System.out.println("accno is"+ accNo);
    System.out.println("accno is"+ accHolderName);
    System.out.println("accno is"+ balance);
	}

}
