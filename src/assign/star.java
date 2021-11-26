package assign;
public class star {
	public static void main(String[] args) {
				int i,j,t=4;
				for(i=0;i<t;i++)
				{
					for(j=i;j<t;j++)
					{
						System.out.print("  ");
					}
					for(j=0;j<=2*i;j++)
					{
						System.out.print("* ");
					}
					System.out.println();
				}

			}

		}
