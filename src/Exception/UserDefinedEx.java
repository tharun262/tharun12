package Exception;
import java.util.Scanner;
 
class PasswordException extends Exception{   //1
    public PasswordException(String s)  //2 para constructor
    {
        super(s); //calling the parent class  constructor
    }
}
 
public class UserDefinedEx {
    public static void main(String[] args)  {
        //accept a password from the user , if the length is less than 5 
        // throw an exception
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the password ");
        String password=sc.next();
        try    {
            if(password.length() <5)  //3
            {     //4
                throw new PasswordException("Error : Password should be more than 5 characters !!!");
            }
            else
                System.out.println("Valid password !!");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("this is finally block");
        }
 
    }
 
}