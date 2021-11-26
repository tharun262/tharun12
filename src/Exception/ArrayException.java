package Exception;

public class ArrayException {

	public static void main(String[] args) {
	    try {
	        int[] arr={10,33,44,55};
	        System.out.println("the ele is " + arr[10]); // the index is larger
	    }
	    catch(ArrayIndexOutOfBoundsException e)
	    {
	        System.out.println("Error : the index specified is not correct!!");
	        System.out.println(e);
	    }

	    }
	 
	}
	
