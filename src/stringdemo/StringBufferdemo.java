package stringdemo;

public class StringBufferdemo {

	public static void main(String[] args) {
		StringBuffer str= new StringBuffer("tharun");
		
		str.append("java");
		System.out.println(str);
		System.out.println(str.indexOf("t"));
		str.insert(0,"LTI");
		System.out.println("");
	}

}
