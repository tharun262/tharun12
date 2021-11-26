package module2;



import java.util.Scanner;



public class Emp {

private int empId; //mv
private String name;
private double sal; //mv


Scanner sc=new Scanner(System.in);


public void accept() {
System.out.println("enter the employee id ");
empId=sc.nextInt(); //3



System.out.println("enter the name ");
name=sc.next();



System.out.println("enter the salary");
sal=sc.nextDouble();

}

public void display() {
System.out.println("Employee id number is " + empId + " name is " + name + " salary is "+sal);
}
}
