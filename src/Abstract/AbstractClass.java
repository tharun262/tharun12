package Abstract;

public class AbstractClass {

	public static void main(String[] args) {
	Dog tuffy=new Dog();
	tuffy.sound();
	tuffy.classInfo("dog");
	}

}
abstract class Animal
{
	int legs=4;
	abstract void sound();
	void classInfo(String type)
	{
		System.out.println("I belongs to "+ type +"family");
	}
}
class Dog extends Animal{
	void sound()
	{
		System.out.println("woof woof.......");
		System.out.println("i have "+ legs +"legs");
	}
}