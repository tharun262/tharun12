package assign2;
import java.util.Scanner;
public class circle {
		private int radius;
		private double area1;
	    final double PI=3.14;
	    
		    Scanner sc= new Scanner(System.in);
		 
		    public void accept()      {
		    	System.out.println("enter the radius");
		    	radius= sc.nextInt();
		    }
		    public void display() {
		    System.out.println("the radius is"+ radius);
		    System.out.println("the area is"+ area1);
		    }
		    public void calArea() {
		    	area1= PI* radius* radius;
		    }
	}


