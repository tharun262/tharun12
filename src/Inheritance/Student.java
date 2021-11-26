package Inheritance;

public class Student extends Person{
  //(roll, grade, marks, stream)  //7
    protected int roll;
    protected char grade;
    protected double marks;
    protected String stream;
    
    public Student(String name, char gender, int age, int roll, char grade, double marks, String stream) {
		super(name, gender, age);
		this.roll = roll;
		this.grade = grade;
		this.marks = marks;
		this.stream = stream;
	}
	@Override
    public String toString() {
        return super.toString() + "Student [roll=" + roll + ", grade=" + grade + ", marks=" + marks + ", stream=" + stream + "]";
    }  //calling the tosting method of parent class

}