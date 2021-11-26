package module3;

public class DoWhile {

	public static void main(String[] args) {
	int count=1;
	do {
		if(count%2==0) {
			System.out.println(count);
		}
		count++;
	}
	while(count<=20);
}
}
