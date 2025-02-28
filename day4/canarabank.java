package Week2.day4;

public abstract class canarabank implements payment{
	    abstract void recordPaymentDetails();


	
		public void cashOnDelivery()
		{
			System.out.println("Pay on cash delivery");
		}
		public void upiPayments()
		{
			System.out.println("Pay on upipayment");
		}
		public void cardPayments()
		{
			System.out.println("Proceed with cardpayments");
		}
		public void InternetBanking()
		{
			
			System.out.println("Go with internetbanking");
			
	}

}
