package Interface;
interface I1{
	void fun1();
}
public class Circle implements Graphic,I1{
private float radius;
public Circle(float radius) {
	this.radius =radius;
	}
public float area()
{
	return (PI* radius* radius);
}
public float peri()
{
	return 2* PI* radius;
}
public void fun1(){
	System.out.println("dddd");  
}

}
