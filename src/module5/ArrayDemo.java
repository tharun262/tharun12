package module5;
import java.util.Scanner;
 
public class ArrayDemo {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int[] num=new int[5];  //0 1 2 3 4
        System.out.println("enter the 5 integer values ");
        for(int i=0; i<5; i++)
        {
            num[i]=sc.nextInt();
        }
        
        for(int i=0; i<5; i++)
        {
        	   System.out.println("5 integer values are "+num[i]);
        	  
        }

        //to display
        System.out.println("======================================");
        System.out.println("enhanced for loop");

        for(int pr: num)
        {  //    v    arr
            System.out.println(pr);
        } 


    }
 
}