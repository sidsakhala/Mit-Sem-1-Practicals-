import java.util.Scanner;
public class Seven {
 
 public static void main(String[] args) {
        String test = "sudhanshu sakhala@gmail.com";
        count(test);
 
    }
    public static void count(String x){
        char[] ch = x.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int otherchat = 0;
        for(int i = 0; i < x.length(); i++){
            if(Character.isLetter(ch[i])){
                letter ++ ;
            }
            else if(Character.isDigit(ch[i])){
                num ++ ;
            }
            else if(Character.isSpaceChar(ch[i])){
                space ++ ;
            }
            else{
                otherchat ++;
            }
        }
        System.out.println("The string is : sudhanshu sakhala@gmail.com");
        System.out.println("letter: " + letter );
        System.out.println("space: " + space );
        System.out.println("number: " + num );
        System.out.println("other: " + otherchat );
            }
}