package weekonedayfour;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
String text1="stops";
String text2="potss";
int length1=text1.length();
int length2=text2.length();
char [] a=text1.toCharArray();
char [] b=text2.toCharArray();
if(length1!=length2)
{
	System.out.println("Length Mismatch therefore two strings are not an Anagram");
}
Arrays.sort(a);
System.out.println(a);
Arrays.sort(b);
System.out.println(b);	

		
			if(Arrays.equals(a,b))
			{
				System.out.println("It is anagram");
			}
			else
				System.out.println("It is not anagram");
		}
	}
		
	
	
			


