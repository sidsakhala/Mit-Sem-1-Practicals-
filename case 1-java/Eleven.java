import java.util.*; 
public class Eleven {
 public static void main(String[] args)
 {
    int[] nums = {1,2,3,4,5,6,7,8,9,10};
    int ctreven = 0, ctrodd = 0;
    System.out.println("Original Array: "+Arrays.toString(nums)); 
 
    for(int i = 0; i < nums.length; i++) {
        if(nums[i] % 2 == 0)
        {         
          ctreven++;
        }
        else
           ctrodd++;    
    }                 
    System.out.printf("\nNumber of even elements in the array: %d",ctreven);
    System.out.printf("\nNumber of odd elements in the array: %d",ctrodd);
    System.out.printf("\n");    
  }
}