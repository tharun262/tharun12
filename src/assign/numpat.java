package assign;
public class numpat {
	public static void main(String[] args) {
		for(int i=1;i<5;i++)
		{
			for(int j=i;j<5;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i*1.5;j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}

}

