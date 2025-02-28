package Week2.day4;

public abstract class MySqlConnection implements DatabaseConnection {

	abstract void executeQuery();
	
	public void connect()
	{
		System.out.println("connected");
	}
	public void disconnect()
	{
		System.out.println("disconnected");
	}
	public void executeUpdate()
	{
		System.out.println("update");
	}
	

}


