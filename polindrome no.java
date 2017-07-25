package ps;

import java.util.Scanner;
public class SAample 
{
		 public static void main(String args[]){  
			 Scanner main=new Scanner(System.in);

			 System.out.println("input : ");
			 int p=main.nextInt();


		  int r,sum=0,temp;    
		  int n = 0;
		temp=n;    
		  while(n>0){    
		   r=n%10;  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
		}  
		}  
