package miniproject;
	import java.text.SimpleDateFormat;
	import java.util.HashMap;
	import java.util.*;

	public class GetterComp{
		DataReader bankfileR= new DataReader();
		Scanner sc=new Scanner(System.in);

		void loadData()
		{
			bankfileR.fileLoader();
		}

		void complaintsBasedOnYear(String year)
		{
			Set<String>st=new HashSet<String>();
			for (HashMap.Entry<String,DetailComplaint> entry :bankfileR.GetMapBankobjcompdet().entrySet()) 
			{
				if(entry.getValue().dateReceived.contains(year))
					  { 
					st.add(entry.getValue().issue);
				  		
					  }
			}
			for(String i:st) {
				System.out.println(i);
			}
		}
			
		void complaintsBasedOnCompany(String u_company)
		{
			Set<String>st=new HashSet<String>();
			for (HashMap.Entry<String,DetailComplaint> entry :bankfileR.GetMapBankobjcompdet().entrySet())
		 
		{
		  if(entry.getValue().company.equalsIgnoreCase(u_company))
		  {
			  st.add(entry.getValue().issue + " "+ u_company);
			
		  }

		}
			  for(String i:st) {
				  System.out.println(i);
			  }
		}

		void complaintsBasedOnComplaintID(String id)
		{
			if(bankfileR.GetMapBankobjcompdet().containsKey(id)){
				DetailComplaint Complain = bankfileR.GetMapBankobjcompdet().get(id);

				System.out.println( Complain);

			}
			return;
		}

		void NoOfDaysTOCloseComplaint(String compid)
		{
			try {
				if (bankfileR.GetMapBankobjcompdet().containsKey(compid)) {
					DetailComplaint Complain = bankfileR.GetMapBankobjcompdet().get(compid);

					String d1s = Complain.dateSentToCompany;
					String d2s = Complain.dateReceived;
					Date d2 = new SimpleDateFormat("MM/dd/yyyy").parse(d1s);
					Date d1 = new SimpleDateFormat("MM/dd/yyyy").parse(d2s);

					long difference_In_Time
							= d2.getTime() - d1.getTime();
					long difference_In_Days
							= (difference_In_Time
							/ (1000 * 60 * 60 * 24))
							% 365;
					System.out.println(difference_In_Days + "   days");


				}
			}
			catch (Exception e){
				System.out.println(e);
			}

		}


		void complaintsClosed()
		{
		for (HashMap.Entry<String,DetailComplaint> entry :bankfileR.GetMapBankobjcompdet().entrySet()) 
		{
			String compResp=entry.getValue().companyResponseToConsumer;
			
		  if(compResp.equalsIgnoreCase("Closed") || compResp.equalsIgnoreCase("Closed with explanation"))
		  {
			  System.out.println(entry.getValue().dateReceived + " "+ entry.getValue().product+" "+entry.getValue().subProduct+" "+entry.getValue().issue+" "+entry.getValue().subIssue+" "+entry.getValue().company+" "+entry.getValue().ZIPcode+" "+entry.getValue().state+" "+entry.getValue().submittedVia+" "+entry.getValue().dateSentToCompany+" "+entry.getValue().companyResponseToConsumer+" "+entry.getValue().timelyResponse+" "+entry.getValue().consumerDisputed);
		  }

		}

		}


		void complaintsReceivingTimelyResponse()
		{
		for (HashMap.Entry<String,DetailComplaint> entry :bankfileR.GetMapBankobjcompdet().entrySet()) 
		{
			if(entry.getValue().timelyResponse.equals("Yes"))
			{
				System.out.println(entry.getValue().dateReceived + " "+ entry.getValue().product+" "+entry.getValue().subProduct+" "+entry.getValue().issue+" "+entry.getValue().subIssue+" "+entry.getValue().company+" "+entry.getValue().ZIPcode+" "+entry.getValue().state+" "+entry.getValue().submittedVia+" "+entry.getValue().dateSentToCompany+" "+entry.getValue().companyResponseToConsumer+" "+entry.getValue().timelyResponse+" ");
			}
		}
		}

		public GetterComp() {
			super();
		}
		}

