package stringdemo;
 
public class StringBuilderDemo {
 
    public static void main(String[] args) {
        StringBuilder s1=new StringBuilder("Welcome");
        s1.append("Priti");
        System.out.println(s1);

        //to change the specific position
        System.out.println(s1.insert(1,"dy"));
        //1 : position  2: value
        System.out.println(s1);

        StringBuilder s2=new StringBuilder("Ramesh");
        s2.replace(3, 6, "ach");
        System.out.println(s2);
 
    }
 
}