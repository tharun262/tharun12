package Exception;

public class SingleException {
	
	public static int divide(int a,int b) 
	{
		return (a/b);
	}
	public static void main(String[] args) {

	int num1=100;
	int num2=10;
	int result;
	
	try {
		result =divide(num1,num2);
		System.out.println("the result is"+result);
	}
	catch(ArithmeticException e)
	{
	System.out.println("cannot divide by 0");
	}
	}	}