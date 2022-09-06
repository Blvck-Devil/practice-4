// input the length and the width of a rectangle and calculate and print the perimeter. 
import java.util.*;
public class Main {

    public static void main(String args[]) {
      int Length,Width;
      int perimeter;

      Scanner a=new Scanner(System.in);

      System.out.println("Perimeter of a Rectangle");
        System.out.println("Input Length:");
      int length=a.nextInt();
      
        System.out.println("Input Width:");
      int width=a.nextInt();

      perimeter=2*(length+width);

      System.out.println("Perimeter is:"+perimeter);
      
    }
}