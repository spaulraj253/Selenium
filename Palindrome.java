package week1.Assignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
			  int r,sum=0,temp;    
			  int num=454;//It is the number variable to be checked for palindrome  
			  
			  temp=num;    
			  while(num>0){    
			   r=num%10;  //getting remainder  
			   sum=(sum*10)+r;    
			   num=num/10;    
			  }    
			  if(temp==sum)    
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome");    
			}  
			  

	}


