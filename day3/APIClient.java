package day3;

public class APIClient {
	public void sendRequest(String Endpoint)
	{
System.out.println("One Argument");
}
	public void sendRequest(String Endpoint,String requestBody,String requestStatus)
	{
		System.out.println("Multiple Argument");
}
	public static void main(String[] args) 
	{
		APIClient ap=new APIClient();
		
		ap.sendRequest("ADF", "WER", "SDF");
		ap.sendRequest("SBV");
	}
	
	
}
