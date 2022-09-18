import java.util.Scanner;
public class Thirteen {
     public static void main(String[] arg) 
     {
       int num1, num2 ;
       Scanner in = new Scanner(System.in);    
       System.out.print("Enter 1st number: ");
       num1 = in.nextInt(); 
       System.out.print("Enter 2nd number: ");
       num2 = in.nextInt(); 
      while(num2 != 0){
            int carry = num1 & num2;
            num1 = num1 ^ num2;
            num2= carry << 1;
        }
        System.out.print("Sum: "+num1); 
        System.out.print("\n");         
    }    
}