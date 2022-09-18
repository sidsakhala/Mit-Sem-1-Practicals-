import java.util.Scanner;
 
public class Two {
 
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
 
  System.out.print("Input 1st number: ");
  int num1 = in.nextInt();
 
  System.out.print("Input 2nd number: ");
  int num2 = in.nextInt();
 
  System.out.print("Input 3rd number: ");
  int num3 = in.nextInt();
 
  System.out.print("Input 4th number: ");
  int num4 = in.nextInt();
 
  System.out.print("Enter 5th number: ");
  int num5 = in.nextInt();
 
   System.out.println("Average of 5 numbers is: " + 
   (num1 + num2 + num3 + num4 + num5) / 5);
 }
}