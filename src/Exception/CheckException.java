package Exception;


	import java.io.*;
	 
	public class CheckException {
	 
	    public static void main(String[] args) throws IOException {
	        FileInputStream fis=new FileInputStream("e:\\t2\\t2.txt");

	        //throw 
	        //throws  : it used to throw the exception

	        int k;
	        while((k=fis.read()) !=-1)
	        {
	            System.out.println((char)k);
	        }
	        fis.close();
	 
	    }
	 
	
	}

