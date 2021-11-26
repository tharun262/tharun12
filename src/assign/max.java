package assign;
import java.util.Scanner;
public class max {
	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				int num[]=new int[1000000];
				int max=0;
				int min=10000;
				int i;
				System.out.println("Enter the numbers");
				int n=sc.nextInt();
				for( i=1;i<=n;i++)
				{
					num[i]=sc.nextInt();
					 if(min>num[i])
						{
							min=num[i];	
						}	
				}
				System.out.println("The minimum number is="+min);
				for( i=1;i<=n;i++)
				{
					
				if(max<num[i])
				  {
					max=num[i];
							
				  }	
				}
				
				System.out.println("The maximum number is="+max);
				
			}

		}
