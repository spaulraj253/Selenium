package weekonedayfour;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
int a[]= {1,4,3,2,8,6,7};
Arrays.sort(a);
System.out.println(Arrays.toString(a));
int n=a[a.length-1];
int count=0;
for(int i=a[0];i<n;i++)
{
	if(a[count]==i)
	{
		count++;
	}else
	{
		System.out.println(i);
	}
		
}

	}

}
