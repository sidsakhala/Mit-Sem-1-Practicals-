import java.util.*; 
public class Twelve {
 public static void main(String[] args)
 {
        Scanner in = new Scanner(System.in);    
        System.out.print("Enter a integer: ");
        int num = in.nextInt(); 
        System.out.printf("Is %d is a palindrome number?\n",num);
        System.out.println(palindrome(num)); 
    }
 
private static boolean palindrome(int num) {
        String str = String.valueOf(num);
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i++) != str.charAt(j--)) {
                return false;
            }
        }
        return true;
  }
}