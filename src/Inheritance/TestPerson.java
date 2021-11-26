package Inheritance;
public class TestPerson {
 
    public static void main(String[] args) {
        Person person=new Person("tharun", 'M', 23);
        person.fun1();
        System.out.println(person); 
        
        Student st=new Student("tharun", 'M', 21, 1, 'A', 88, "electrical");
        System.out.println(st);

    }
 
}