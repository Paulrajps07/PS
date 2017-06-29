
import java.util.Scanner;  
class FactorialExample{

 public static void main(String args[]){  
 Scanner main=new Scanner(System.in);
 System.out.println("Input :");
   int number=main.nextInt(); 
   int i,fact=1; 
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println("output :"+fact);    
 }  
}  