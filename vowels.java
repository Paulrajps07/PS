import java.util.Scanner;
public class Java{
  public static void main(String []args){
  char ch;
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the Value=");
   ch = scan.next().charAt(0);
    if(ch=='A' || ch=='a'|| ch=='E' || ch=='e'|| ch=='I' || ch=='i'|| ch=='O' || ch=='o'|| ch=='U' || ch=='u'){
      System.out.println(ch+ " is a Vowel");}
     else{
      System.out.println(ch+ " is a not Vowel");
    }
  }
}

    