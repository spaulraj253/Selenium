package Week2.day4;

public class Amazon extends canarabank {

	public static void main(String[] args) {
		Amazon a= new Amazon();
		a.cashOnDelivery();
		a.upiPayments();
		a.cardPayments();
		a.InternetBanking();
		a.recordPaymentDetails();
	}

	@Override
	void recordPaymentDetails() {
		System.out.println("paymentdetails");
	}

}
