package module2;
 
public class TestEmp {
 
    public static void main(String[] args) {
        Emp emp=new Emp();
        emp.accept();
         System.out.println("============================");
        System.out.println("calling the display method");
        emp.display();

        System.out.println("===============================");
        System.out.println("Creating second object");
        Emp emp2=new Emp();
        emp2.accept();
        emp2.display();



    }
 
}