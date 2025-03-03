package day3;

public class LoginTestData extends TestData{

	
	public void enterUsername()
	{
		System.out.println("Enter the username");
	}
	public void enterPassword()
	{
		System.out.println("Enter the PAssword");
	}
	
public static void main(String[] args) {
	LoginTestData Test= new LoginTestData();
	Test.enterCredentials();
	Test.enterPassword();
	Test.enterUsername();
	Test.navigateToHomepage();
}

}
