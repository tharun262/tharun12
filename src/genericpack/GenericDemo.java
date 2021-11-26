package genericpack;

public class GenericDemo {
	    public <E> void printArray(E[] inputArray) {
	        for (E i : inputArray) {
	            System.out.println(i);
	        }
	    }
	/*
	 *     public <E> void printArray(E[] inputArray) {
	 
	1  <E>  :         return type   : int, float, double 
	2  E[]   :         : parameter 
	 
	 */
	    public static void main(String[] args) {
	        Integer[] intarr = { 22, 44, 55, 66, 77 };
	 
	        GenericDemo obj = new GenericDemo();
	        System.out.println("printing the integer array");
	        obj.printArray(intarr);  //para : integer
	 
	        System.out.println("----------------------------------------------");
	        System.out.println("print float array");
	 
	        Float[] arrf = { 22.6f, 44.6f, 55.6f, 66.676f, 77.8787f };
	        obj.printArray(arrf); //para : float 

	        System.out.println("----------------------------------------------");
	        System.out.println("print double array");
	        Double[] d= {565.2,55.5,88.6, 88.43, 55.22, 77.21,88.33, 34.99};
	        obj.printArray(d); 
	 
	    }
	 
	}