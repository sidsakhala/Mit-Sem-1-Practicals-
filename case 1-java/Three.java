import java.util.Scanner;
public class Three {
      public static void main(String args[])
    {
        int decimalnum, quot, i=1, j;
        int bin_num[] = new int[100];
        Scanner scan = new Scanner(System.in);
 
        System.out.print("Enter a Decimal Number : ");
        decimalnum = scan.nextInt();
 
        quot = decimalnum;
 
        while(quot != 0)
        {
            bin_num[i++] = quot%2;
            quot = quot/2;
        }
 
        System.out.print("Binary number is: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(bin_num[j]);
        }
        System.out.print("\n");
    }
}