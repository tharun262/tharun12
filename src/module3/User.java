package module3;
import java.util.Scanner;

public class User {
		    private String userName;
	        private int userAge;
	        private double salary;
	        Scanner sc=new Scanner(System.in);

	        public void accept()
	        {
	            System.out.println("age,name,salary"); 
	            userAge=sc.nextInt(); 
	            userName=sc.next();
	            salary=sc.nextDouble(); 
	}
	        
	        public void display() {  
	            System.out.println("age"+ userAge);    
	            System.out.println("name"+ userName);
	            System.out.println("salary"+ salary);
	        }
	        
	        public void checkAge() {  
	        	 if(userAge<0)
	            	 System.out.println("age cannot be negative");  
	        	 else if (userAge<18)
	            	 System.out.println("not eligible to vote");  
	              else 
	            	 System.out.println("eligible to vote");
	        }
	        public void checkSal() {  
	        	 if(salary<0 && salary>200000)
	            	 System.out.println("valid salary");  
	        	 else
	            	 System.out.println("Invalid salary");  
	        }
	        

}
