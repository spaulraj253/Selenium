package weekonedayfour;
import java.util.Arrays;

public class Finddups {

	public static void main(String[] args) {
		int[] num={2, 5, 7, 7, 5, 9, 2, 3};
		Arrays.sort(num);
		for (int i=1;i<num.length;i++)
		{
			if (num[i]==num[i-1])
					{
					System.out.println("Duplicate arrays are" + num[i])	;
					}
			}
		}
	}


