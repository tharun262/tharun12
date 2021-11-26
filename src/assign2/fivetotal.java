package assign2;
import java.util.Scanner;
public class fivetotal {
	public static void main(String[] args) {
				int a,b,c,d,e,total,discount,totalamt;
				System.out.println("enter num1");
				Scanner sc= new Scanner(System.in);
				a=sc.nextInt();
				
				System.out.println("enter num2");
				b=sc.nextInt();
				
				System.out.println("enter num3");
				c=sc.nextInt();
				
				System.out.println("enter num4");
				d=sc.nextInt();
				
				System.out.println("enter num5");
				e=sc.nextInt();
				total=a+b+c+d+e;
				
				System.out.println("total value of five numbers are "+ total);
				
				discount= (total *10)/100;
				System.out.println("discount is 10% of total bill "+ discount);
				
				totalamt=total-discount;
				System.out.println("total amount is "+ totalamt);
	}

}
