package module2;
 
public class TestStudent1 {
 
    public static void main(String[] args) {
        Student1 student1=new Student1();
        student1.accept();
        student1.display();

        System.out.println("=====================================");
        System.out.println("Creating second obj");
        Student1 student2=new Student1();
        student2.accept();
        student2.display();

        System.out.println("=====================================");
        System.out.println("Creating third obj");
        Student1 student3=new Student1();
        student3.accept();
        student3.display();


    }
 
}