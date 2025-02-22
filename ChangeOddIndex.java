package weekonedayfour;

public class ChangeOddIndex {

	public static void main(String[] args) {
		String test="changename";
		String character="";
		char[] a=test.toCharArray();
		for(int i=0;i<a.length;i++)
		{
		a[i]=Character.toUpperCase(a[i]);	
		}
character=new String(a);
System.out.println(character);
	}

}
