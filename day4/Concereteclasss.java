package Week2.day4;

public class Concereteclasss extends MySqlConnection {

	@Override
	void executeQuery() {
		System.out.println("ExecutedQuery");		
	}
	
	public static void main(String[] args)
	{
		Concereteclasss c1=new Concereteclasss();
		c1.connect();
		c1.disconnect();
		c1.executeUpdate();
		c1.executeQuery();
	}

}
