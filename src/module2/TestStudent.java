package module2;
import java.util.Scanner;  //1
 

public class Student1 {
    private int rollNo;  
    private String name;  
    private double score;

    Scanner sc=new Scanner(System.in);   //2

    public void accept()
    {
        System.out.println("enter the rollno ");
        rollNo=sc.nextInt();   //3

        System.out.println("enter the name ");
        name=sc.next();

        System.out.println("enter the score");
        score=sc.nextDouble();
    }
 
    public void display() {  
        System.out.println("rollno is "+ rollNo  + " name is " + name + " score is " + score);    
    }

}