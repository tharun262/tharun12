package collection;
 
import java.util.ArrayList;
import java.util.List;
 
public class ArrayList2 {
 
    public static void main(String[] args) {
        List<Emp> employees = new ArrayList<Emp>();

        //collections of emp objec ts
        Emp emp1=new Emp(1, "pr");
        Emp emp2=new Emp(2, "priya");
        Emp emp3=new Emp(3, "priti");
        Emp emp4=new Emp(4, "ram");
        Emp emp5=new Emp(5, "yogesh");

        //to add the objs in collection
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);
    }
 
}