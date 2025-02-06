package week1.Assignments;

public class primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
			  int num=3;
			  boolean prime=true;
			  for (int i=2;i<num;i++)
{
	if(num%i==0)
	{
		prime=false;
		break;
	}
}
if(prime==true) {
	System.out.println("Prime Number");
}
else
	System.out.println("Not prime number");
	}}