import java.util.*;
import java.lang.*;
import java.io.*;
public class ArrayInputDemo { 
public static void main(String[] args) 
{  
Scanner sc = new Scanner(System.in); 
System.out.println("Please enter size of array");
 int size = Integer.parseInt(args[0]);
 int[] arr = new int[size];
 System.out.println("Please enter array elements."); 
for (int i = 1; i <= args.length; i++) 
{
 int element = Integer.parseInt(args[i]);
 arr[i] = element;
 }

for (int i = 1; i <= args.length; i++) 
{
 System.out.println(arr[i]);
 System.out.println("\n");

 }
sc.close(); 
} 
}

