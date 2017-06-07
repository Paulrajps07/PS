import java.util.Scanner;
public class EvenOdd{
  public static void main(String []args){
    Scanner in=new Scanner(System.in);
    System.out.println("Enter the Value=");
    int n=in.nextInt();
    if(n==0){
      System.out.println(n+ " is an Zero Number");}  
    if(n>0){
      System.out.println(n+ " is an postive Number");}
     
    else{
      System.out.println(n+ " is an negative Number");
    }
  }
}

    