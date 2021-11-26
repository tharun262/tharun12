package stringdemo;
import java.util.Date;
import java.time.*;
 
public class DateClass {
 
    public static void main(String[] args) {
//                Date d=new Date();
//                System.out.println(d.toString());  //date and time
 
    LocalDateTime t1=LocalDateTime.now();
    System.out.println(t1);  //date and time


    //display the monht , date, yr , sec
    LocalDate date1=t1.toLocalDate();
    System.out.println(date1);  //yr month date

    System.out.println("month " +t1.getMonth());  
    System.out.println("sec " + t1.getSecond());
    System.out.println(" min " +t1.getMinute());
    System.out.println(" yr " +t1.getYear());
    System.out.println("day is " + t1.getDayOfYear());




    }
 
}