package stringdemo;

public class Stringclass {
	public static void main(String[] args) {
	        String a="Priti";
	        System.out.println(a.toUpperCase());
	        System.out.println(a.toLowerCase());

	        String a1="          Uma ";
	        System.out.println(a1.trim());  //to remove the extra spaces
	        String newa=a.replace("i", "ee");
	        System.out.println(newa); //Preetee
	        System.out.println(newa.charAt(2)); //e   3rd ch
	        System.out.println(newa.concat(" dalvi"));
	        System.out.println(newa.contains("ree"));   //t  /f  




	 
	    }
	 
	}