import java.util.Scanner;
public class online {
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.println("input : ");
int n=in.nextInt();
if(n%4==0)
System.out.println( n+" is a leap year");
else
System.out.println (n+" is not leap year");
}
}