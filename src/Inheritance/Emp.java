package Inheritance;
 
public class Emp extends Student {
    //(empno, company, desg , sal)
    private int empNo;
    private String company;
    private String desg;
    private double sal;

    public Emp(String name, char gender, int age, int roll, char grade, double marks, String stream, int empNo,
            String company, String desg, double sal) {
        super(name, gender, age, roll, grade, marks, stream);  //7
        this.empNo = empNo;
        this.company = company;
        this.desg = desg;
        this.sal = sal;
    }
 
    @Override
    public String toString() {
        return "Emp [empNo=" + empNo + ", company=" + company + ", desg=" + desg + ", sal=" + sal + ", roll=" + roll
                + ", grade=" + grade + ", marks=" + marks + ", stream=" + stream + ", name=" + name + ", gender="
                + gender + ", age=" + age + "]";
    }







}