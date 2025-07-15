import java.util.Scanner;

public class NumbersDemo {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter an integer: ");
      int num1 = input.nextInt();    
      System.out.print("Enter another integer: ");
      int num2 = input.nextInt();
      
      displayTwiceTheNumber(num1, num2);
      displayNumberPlusFive(num1, num2);
      displayNumberSquared(num1, num2);
      
   }
   
   public static void displayTwiceTheNumber(int num1, int num2) {
      num1 += num1;
      num2 += num2;
      
      System.out.println("Twice the Number");
      System.out.println(num1);
      System.out.println(num2+ "\n");
      
   }
   
   public static void displayNumberPlusFive(int num1, int num2) {
      num1 += 5;
      num2 += 5;
      
      System.out.println("Number Plus Five");
      System.out.println(num1);
      System.out.println(num2+ "\n");
      
   
   }
   
   public static void displayNumberSquared(int num1, int num2) {
      num1 *= num1;
      num2 *= num2;
      
      System.out.println("Number Squared");
      System.out.println(num1);
      System.out.println(num2);
   }

}