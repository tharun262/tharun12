package csvDemo;
		import java.io.*;  
		import java.util.Scanner;  
		public class readCsv  
		{  
		public static void main(String[] args) throws Exception  
		{  
	
		Scanner sc = new Scanner(new File("E:\\complaints.csv"));  
		sc.useDelimiter(",");   
		while (sc.hasNext())    
		{  
		System.out.print(sc.next());   
		}   
		sc.close();  
	}

}
