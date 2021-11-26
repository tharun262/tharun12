package module3;
import java.util.Scanner;
 
public class SwitchCseDemo {
 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a number between 1 to 7");
        int a=sc.nextInt();

        switch(a)
        {
        case 1 :
            System.out.println("it is monday today !!");
            break;
        case 2 :
            System.out.println("it is tuesday today !!");
            break;
        case 3 :
            System.out.println("it is wednesday today !!");
            break;
        case 4 :
            System.out.println("it is thursday today !!");
            break;
        case 5 :
            System.out.println("it is friday today !!");
            break;
        case 6 :
            System.out.println("sleepy saturday  !!");
            break;
        case 7 :
            System.out.println("enjoy the day today !!");
            break;
        default :
            System.out.println("invalid input !!");
            break;


        }

    }
 
}