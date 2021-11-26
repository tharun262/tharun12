package assign2;
import java.util.Scanner;
	public class Disp {
	private int empsal1; 
	private int empsal2;
	private double Sal;

	Scanner sc=new Scanner(System.in);
	public void accept() {
	System.out.println("enter the sal of emp1");
	empsal1=sc.nextInt(); 

	System.out.println("enter the sal of emp2 ");
	empsal2=sc.nextInt();
	}
	public void display() {
		System.out.println("total sal of both emp 1 and 2 are " + Sal);
		}
    public void calSal() {
    	Sal= empsal1+empsal2;
    }
	}
	