package module4;
 
public class TestEmp {
 
    public static void main(String[] args) {
        Emp emp1=new Emp();   
        System.out.println(emp1);  

        System.out.println("=================================");
        System.out.println("Creating object with parameater");
        Emp emp2=new Emp(1, "shiv", 60000); 
        System.out.println(emp2);  
    }
 
}