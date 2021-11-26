package miniproject;
import java.util.Scanner;
	public class inputAnalyser{
		public static void main(String[] args) {
			 
			GetterComp fetch= new GetterComp();
			fetch.loadData();
			Scanner sc=new Scanner(System.in);
			System.out.println("Tharunkumar Complaints Analyzer");
			System.out.println("Enter your option between 1 to 7");
			System.out.println("1.Display all the complaints based on the year provided by the user ");
			System.out.println("2.Display all the complaints based on the name of the bank provided by the user");
			System.out.println("3.Display complaints based on the complaint id provided by the user ");
			System.out.println("4.Display number of days took by the Bank to close the complaint ");
			System.out.println("5.Display all the complaints closed/closed with explanation ");
			System.out.println("6.Display all the complaints which received a timely response ");
			System.out.println("7.Take input from user to store new complaints ");
			
			int option=sc.nextInt();
			sc.nextLine();
			
			switch(option)
			{
			case 1: 
				System.out.println("Enter year");
				String year=sc.next();
				fetch.complaintsBasedOnYear(year);
			break;
			case 2:
				System.out.println("Enter company name");
			    String u_company=sc.next(); 
				fetch.complaintsBasedOnCompany(u_company);
			break;
			case 3: 
				System.out.println("Enter the Complaint ID");
				String id=sc.next();
				fetch.complaintsBasedOnComplaintID(id);
			break;
			case 4: 
				System.out.println("Enter Complaint ID");
				String compid=sc.next();
				fetch.NoOfDaysTOCloseComplaint(compid);
			break;
			case 5: 
				fetch.complaintsClosed();
			break;
			default: System.out.println("Please Enter valid option");
			
			}
			sc.close();
		}
		}


